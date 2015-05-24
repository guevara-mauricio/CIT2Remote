package com.simbios.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import simbios.com.spring.dao.PersonDAO;
import simbios.com.spring.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	private PersonDAO personDAO;
	
	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	
	@Override
	@Transactional
	public void addPerson(Person p) {
		// TODO Auto-generated method stub
        personDAO.addPerson(p);
	}

	
	@Override
	@Transactional
	public void updatePerson(Person p) {
		// TODO Auto-generated method stub
		personDAO.updatePerson(p);
	}

	@Override
	@Transactional
	public List<Person> listPersons() {
		// TODO Auto-generated method stub
		return personDAO.listPersons();
	}

	@Override
	@Transactional
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return personDAO.getPersonById(id);
	}

	@Override
	@Transactional
	public void removePerson(int id) {
		// TODO Auto-generated method stub
		personDAO.removePerson(id);
	}

}
