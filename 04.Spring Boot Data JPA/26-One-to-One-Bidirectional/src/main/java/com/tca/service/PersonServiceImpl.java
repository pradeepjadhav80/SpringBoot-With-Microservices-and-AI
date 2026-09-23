package com.tca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Person;
import com.tca.repository.PersonRepository;

@Service("personService")
public class PersonServiceImpl implements PersonService 
{
	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public Person SavePerson(Person person) 
	{
		return personRepository.save(person);
	}

	@Override
	public Person fetchPersonById(Long id) 
	{
		return personRepository.findById(id).get();
	}

	@Override
	public void removePersonById(Long id) 
	{
		personRepository.deleteById(id);
	}

}
