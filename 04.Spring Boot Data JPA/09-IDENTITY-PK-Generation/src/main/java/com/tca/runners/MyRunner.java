package com.tca.runners;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Gender;
import com.tca.entity.Student;
import com.tca.service.StudentService;

@Component
public class MyRunner implements ApplicationRunner
{
	@Autowired
	private StudentService studentService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		Student ob = new Student();
		ob.setName("Aniket");
		ob.setPer(90.0);
		ob.setGender(Gender.MALE);
		ob.setBirthDate(LocalDate.now());
		
		Student student = studentService.saveStudent(ob);
		
		System.out.println(student);
	}

}
