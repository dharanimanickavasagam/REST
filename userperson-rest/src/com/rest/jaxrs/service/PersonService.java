package com.rest.jaxrs.service;

import com.rest.jaxrs.model.Person;
import com.rest.jaxrs.model.Response;


public interface PersonService {

	public Response addPerson(Person p);
	
	public Response deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();

}
