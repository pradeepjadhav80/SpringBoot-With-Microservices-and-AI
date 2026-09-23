package com.tca.runners;

import java.util.List;

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
	StudentService studentService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
/*		
		//Test code : find  Greater Than Percentage And Gender
		List<Student> list = studentService.fetchAllByGreaterThanPercentageAndGender(80.0, Gender.MALE);
		
		for(Student ob : list)
		{
			System.out.println("Roll No    : "+ob.getRno());
			System.out.println("Name       : "+ob.getName());
			System.out.println("Percentage : "+ob.getPer());
			System.out.println("Gender     : "+ob.getGender());
			System.out.println("Birth Date : "+ob.getBirthDate());
			System.out.println("-".repeat(50));
		}
*/

/*
		//Test Code : Update Student
		studentService.modifyStudentByName("Suyash", 101);
		System.out.println("Student is Updated successfully !!");
*/

/*		
		//Test Code : find Gender and name
		
		List<Object[]> list = studentService.findGenderAndName();
		
		for(Object ob[] : list)
		{
			System.out.println("Gender   : "+ob[0]);
			System.out.println("Name     : "+ob[1]);
			System.out.println("-".repeat(50));
		}
*/
		//Test Code : Count By Gender
		
		List<Object[]> list = studentService.countByGender();
		
		for(Object ob[] : list)
		{
			System.out.println("Gender          : "+ob[0]);
			System.out.println("Count of Gender : "+ob[1]);
			System.out.println("-".repeat(50));
		}
	}

}
