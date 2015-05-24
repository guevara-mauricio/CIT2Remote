package com.simbios.spring.service;

import java.util.List;

import simbios.com.spring.model.Person;

public interface PersonService {
	
	public abstract void addPerson(Person p);
	public abstract void updatePerson(Person p);
	public abstract List<Person> listPersons();
	public abstract Person getPersonById(int id);
	public abstract void removePerson(int id);

}
