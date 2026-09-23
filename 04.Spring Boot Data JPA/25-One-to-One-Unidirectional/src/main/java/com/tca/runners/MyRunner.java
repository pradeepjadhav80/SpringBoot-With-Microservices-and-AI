package com.tca.runners;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Passport;
import com.tca.entity.Person;
import com.tca.service.PersonService;

@Component
public class MyRunner implements ApplicationRunner
{
	@Autowired
	private PersonService personService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
/*		
		//Save passport By Person
		Person person = new Person();
		person.setName("Pradeep");
		person.setDateOfBirth(LocalDate.now());
		
		Passport passport = new Passport();
		passport.setPassportNumber(101L);
		passport.setExpiryDate(LocalDate.now());
		
		person.setPassport(passport);
		personService.SavePerson(person);
		System.out.println("Person is Saved successfully !!");
*/
/*		
		//Fetch Passport by person
		Person person = personService.fetchPersonById(1L);
		System.out.println("Person id   : "+person.getId());
		System.out.println("Person Name : "+person.getName());
		System.out.println("Birth Date  : "+person.getDateOfBirth());
		System.out.println("=".repeat(50));
		
		Passport passport = person.getPassport();
		System.out.println("Passport Number  : "+passport.getPassportNumber());
		System.out.println("Expiry Date      : "+passport.getExpiryDate());
*/
		personService.removePersonById(1L);
		System.out.println("Person is Removed !!");
	}

}
