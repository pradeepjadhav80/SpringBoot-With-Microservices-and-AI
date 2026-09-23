package com.tca.runners;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Passport;
import com.tca.entity.Person;
import com.tca.service.PassportService;
import com.tca.service.PersonService;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class MyRunner implements ApplicationRunner
{
	@Autowired
	private PersonService personService;
	
	@Autowired
	private PassportService passportService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
/*		
		//Save passport By Person
		Person person = new Person();
		person.setName("Aniket");
		person.setDateOfBirth(LocalDate.now());
				
		Passport passport = new Passport();
		passport.setPassportNumber(102L);
		passport.setExpiryDate(LocalDate.now());
				
		person.setPassport(passport);
		personService.SavePerson(person);
		System.out.println("Person is Saved successfully !!");
*/
/*		
		//Fetch Passport by person
		Person person = personService.fetchPersonById(2L);
		System.out.println("Person id   : "+person.getId());
		System.out.println("Person Name : "+person.getName());
		System.out.println("Birth Date  : "+person.getDateOfBirth());
		System.out.println("=".repeat(50));
		
		Passport passport = person.getPassport();
		System.out.println("Passport Number  : "+passport.getPassportNumber());
		System.out.println("Expiry Date      : "+passport.getExpiryDate());
*/
/*		
		//Remove book by person
		personService.removePersonById(1L);
		System.out.println("Person is Removed !!");
*/		
/*		
		//Save passport  by person
		Passport passport = new Passport();
		passport.setPassportNumber(104L);
		passport.setExpiryDate(LocalDate.now());
		
		Person person = new Person();
		person.setName("Aniket");
		person.setDateOfBirth(LocalDate.now());
		passport.setPerson(person);
		person.setPassport(passport);
		
		passportService.savePassport(passport);
		System.out.println("Passport is Saved !!");
*/
/*		
		//Fetch Person By Passport
		Passport passport = passportService.fetchPassportById(104L);
		System.out.println("Passport Number  : "+passport.getPassportNumber());
		System.out.println("Expiry Date      : "+passport.getExpiryDate());		
		System.out.println("-".repeat(50));
		
		Person person = passport.getPerson();
		System.out.println("Person id   : "+person.getId());
		System.out.println("Person Name : "+person.getName());
		System.out.println("Birth Date  : "+person.getDateOfBirth());
*/
		//Remove Passport
		passportService.removePassportById(104L);
		System.out.println("Passport Removed !!");
		
		
	}

}
