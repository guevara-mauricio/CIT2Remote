package simbios.com.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import simbios.com.spring.model.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {

	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);
	private SessionFactory sessionFactory;
	
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addPerson(Person p) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("Person saved succesfully");
	}

	@Override
	public void updatePerson(Person p) {
		
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Person updated succesfully");

	}

	 @SuppressWarnings("unchecked")
	@Override
	public List<Person> listPersons() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Person> personList = session.createQuery("from Person").list();
		for(Person p : personList){
			
			logger.info("Person retrieved");
		}
		return personList;
	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Person p = (Person)session.load(Person.class, new Integer(id));
		logger.info("Person retrieved");
		return p;
	}

	@Override
	public void removePerson(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Person p = this.getPersonById(id);
		if(p!=null){
			
			session.delete(p);
		}
		
		logger.info("Person deleted");

	}

}
