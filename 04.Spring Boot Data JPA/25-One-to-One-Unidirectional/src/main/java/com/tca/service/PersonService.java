package com.tca.service;

import com.tca.entity.Person;

public interface PersonService 
{
	public Person SavePerson(Person person);
	public Person fetchPersonById(Long id);
	public void removePersonById(Long id);
}
