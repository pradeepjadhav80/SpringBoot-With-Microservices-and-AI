package com.tca.runners;

import java.time.LocalDate;
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
	
	private static void printStudent(List<Student> list)
	{
		for(Student s : list)
		{
			System.out.println("Roll Number: " + s.getRno());
			System.out.println("Name       : " + s.getName());
			System.out.println("Percentage : " + s.getPer());
			System.out.println("Gender     : " + s.getGender());
			System.out.println("Birth Date : " + s.getBirthDate());
			System.out.println("-".repeat(50));
		}
	}

	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		
/*		
		Optional<Student> ob = studentService.fetchById(101);
		
		if(ob.isPresent())
		{
			Student s = ob.get();
			System.out.println("Roll Number: " + s.getRno());
			System.out.println("Name       : " + s.getName());
			System.out.println("Percentage : " + s.getPer());
			System.out.println("Gender     : " + s.getGender());
			System.out.println("Birth Date : " + s.getBirthDate());
			
		}
*/
/*		
		List<Student> list = studentService.fetchAll();
		
		if(list.isEmpty())
		{
			System.out.println("No Student Found !!");
		}
		else
		{
			printStudent(list);
		}
*/
/*		
		List<Student> list = studentService.fetchByGender(Gender.MALE);
		
		if(list.isEmpty())
		{
			System.out.println("No Student Found !!");
		}
		else
		{
			printStudent(list);
		}
*/
/*		
		List<Student> list = studentService.fetchByBirthDate(LocalDate.of(2026, 8, 24));
		
		if(list.isEmpty())
		{
			System.out.println("No Student Found !!");
		}
		else
		{
			printStudent(list);
		}
*/
/*		
		List<Student> list = studentService.fetchByBirthDateGreaterThan(LocalDate.of(2026, 7, 24));
		
		if(list.isEmpty())
		{
			System.out.println("No Student Found !!");
		}
		else
		{
			printStudent(list);
		}
*/
/*		
		List<Student> list = studentService.fetchByPerBetween(60.0, 70.0);
		
		if(list.isEmpty())
		{
			System.out.println("No Student Found !!");
		}
		else
		{
			printStudent(list);
		}
*/		
/*		
		List<Student> list = studentService.fetchByBirthDateBetween(LocalDate.of(2025, 8, 1),LocalDate.now());
		
		if(list.isEmpty())
		{
			System.out.println("No Student Found !!");
		}
		else
		{
			printStudent(list);
		}
*/
/*		
		List<Student> list = studentService.fetchByBirthDateAfter(LocalDate.of(2026, 6, 10));
		
		if(list.isEmpty())
		{
			System.out.println("No Student Found !!");
		}
		else
		{
			printStudent(list);
		}
*/
/*		
		List<Student> list = studentService.fetchByBirthDateBefore(LocalDate.of(2026, 6, 10));
		
		if(list.isEmpty())
		{
			System.out.println("No Student Found !!");
		}
		else
		{
			printStudent(list);
		}
*/
/*
		List<Student> list = studentService.fetchByNameStartingWithIgnoreCase("a");
		
		if(list.isEmpty())
		{
			System.out.println("No Student Found !!");
		}
		else
		{
			printStudent(list);
		}
*/		
/*		

		List<Student> list = studentService.fetchByGenderOrderByPer(Gender.MALE);
		
		if(list.isEmpty())
		{
			System.out.println("No Student Found !!");
		}
		else
		{
			printStudent(list);
		}
*/	
/*		
		List<Student> list = studentService.fetchByGenderAndPerGreaterThanEqual(Gender.MALE, 60.0);
		
		if(list.isEmpty())
		{
			System.out.println("No Student Found !!");
		}
		else
		{
			printStudent(list);
		}
*/
		Long cnt = studentService.countByGender(Gender.MALE);
		System.out.println("Gender Count : "+cnt);
		
		if(studentService.existByRno(101))
		{
			System.out.println("Student is Present !!");
		}
		else
		{
			System.out.println("Student is Not Present !!");
		}
	}

}
