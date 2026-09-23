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
		Student student = new Student();
		student.setName("Aniket");
		student.setPer(60.0);
		student.setGender(Gender.MALE);
		student.setBirthDate(LocalDate.now());
		
		Student ob = studentService.saveStudent(student);
		System.out.println(ob);
	}

}
