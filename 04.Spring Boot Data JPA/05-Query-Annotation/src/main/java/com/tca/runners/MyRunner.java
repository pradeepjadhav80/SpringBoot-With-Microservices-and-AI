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
 		//Test Code : fetch All Student
 		
		List<Student> list = studentService.fetchAllStudent();
		
		if(list.isEmpty())
		{
			System.out.println("Student Not Found !!");
		}
		else
		{
			for(Student ob : list)
			{
				System.out.println("Roll Number: " + ob.getRno());
				System.out.println("Name       : " + ob.getName());
				System.out.println("Percentage : " + ob.getPer());
				System.out.println("Gender     : " + ob.getGender());
				System.out.println("Birth Date : " + ob.getBirthDate());
				System.out.println("-".repeat(50));
			}
		}
*/	
/*		
		//Test Code : Percentage Range Between
		List<Student> list = studentService.findPercentageRangeStudent(60.0, 70.0);
		
		if(list.isEmpty())
		{
			System.out.println("Student Not Found !!");
		}
		else
		{
			for(Student ob : list)
			{
				System.out.println("Roll Number: " + ob.getRno());
				System.out.println("Name       : " + ob.getName());
				System.out.println("Percentage : " + ob.getPer());
				System.out.println("Gender     : " + ob.getGender());
				System.out.println("Birth Date : " + ob.getBirthDate());
				System.out.println("-".repeat(50));
			}
		}
*/
		//Test Code : find name per Gender
		
		List<Object[]> list = studentService.findGenderNamePerStudent(60.0,Gender.FEMALE);
		
		for(Object ob[] : list)
		{
			System.out.println("Name       : "+ob[0]);
			System.out.println("Percentage : "+ob[1]);
			System.out.println("Gender     : "+ob[2]);
			System.out.println("-".repeat(50));
		}
	}

}
