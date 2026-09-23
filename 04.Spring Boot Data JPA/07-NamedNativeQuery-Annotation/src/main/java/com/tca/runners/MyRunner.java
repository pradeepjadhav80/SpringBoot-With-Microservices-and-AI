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
	private StudentService studentService;

	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
/*		
		//Test Code : find All By Gender and Percentage
		
		List<Student> list = studentService.findAllByGreaterThanPercentageAndGender(Gender.MALE, 60.0);
		System.out.println(list);
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
		//Test Code : Update Student
		//studentService.updateStudent("Prasad", 101);
		//System.out.println("Student Updated successfully !!");

/*		
		//Test Code : Find Gender and Name
		List<Object[]> list = studentService.findGenderAndName();
		
		for(Object ob[] : list)
		{
			System.out.println("Gender  : "+ob[0]);
			System.out.println("Name    : "+ob[1]);
			System.out.println("-".repeat(50));
		}
*/
		//Test Code : count by gender
		
		List<Object[]> list = studentService.countByGender();
		
		for(Object ob[] : list)
		{
			System.out.println("Gender          : "+ob[0]);
			System.out.println("Count Of Gender : "+ob[1]);
		}
	}

}
