package com.tca.runners;

import java.time.LocalDate;
import java.util.ArrayList;
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
	
	private static void printStudents(List<Student> students)
	{
		for(Student s : students)
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
	public void run(ApplicationArguments args) throws Exception {
		
/*
		 // Test case - save()
		 		
		Student student = new Student(101,"Pradeep",90.2,Gender.MALE,LocalDate.now());
		
		Student s = studentService.saveStudent(student);
		
		System.out.println("Student Data is Saved succesfully : "+s);
*/
/*		
		//Test case - Update Student
		Student student = new Student(101,"Pradeep",90.2,Gender.MALE,LocalDate.now());
		student.setName("Aniket");
		student.setPer(80.6);
		Student s = studentService.updateStudent(student);
		
		System.out.println("Student Data is Updated successfully : "+s);
*/	
/*		
		//Test Case - Save or update
		
		Student s1 = new Student(104,"DDD", 95.0, Gender.MALE, LocalDate.of(2026,8,24));
		studentService.saveOrUpdateStudent(s1);
		System.out.println("Student Data is Saved Succesfully ...");
		
		Student s2 = new Student(101,"AAA", 60.0, Gender.MALE, LocalDate.of(2026,8,24));
		s2.setPer(60.00);
		s2.setName("AAA");
		Student updated = studentService.saveOrUpdateStudent(s2);
		System.out.println("UPDATED STUDENT : " + updated);
	
*/
/*		
		// Test Code for findById() method
		
		Optional<Student> ob = studentService.fetchById(104);
		if(ob.isPresent())
		{
			Student s = ob.get();
			System.out.println("Roll Number: " + s.getRno());
			System.out.println("Name       : " + s.getName());
			System.out.println("Percentage : " + s.getPer());
			System.out.println("Gender     : " + s.getGender());
			System.out.println("Birth Date : " + s.getBirthDate());
		}
		else
		{
			System.out.println("No Data Found !!!");
		}
*/		
/*		
		// Test Code for FetchAllStudents
		List<Student> list = studentService.fetchAllStudent();
		
		if(list.isEmpty())
		{
			System.out.println("Record Not Found !!");
		}
		else
		{
			for(Student s : list)
			{
				System.out.println("Roll Number: " + s.getRno());
				System.out.println("Name       : " + s.getName());
				System.out.println("Percentage : " + s.getPer());
				System.out.println("Gender     : " + s.getGender());
				System.out.println("Birth Date : " + s.getBirthDate());
				System.out.println("-".repeat(20));
			}
		}
*/
/*	
		//Test Code for Delete Student
		
		if(studentService.deleteStudent(104))
		{
			System.out.println("Student is Deleted successfully !!");
		}
		else
		{
			System.out.println("No Record Found !!");
		}
*/
/*		
		//Test Code save All Student
		
		Student ob1 = new Student(102,"Pradeep",90.1,Gender.MALE,LocalDate.of(2024,11, 29));
		Student ob2 = new Student(103,"Aniket",70.1,Gender.MALE,LocalDate.of(2022,12, 2));
		Student ob3 = new Student(104,"Kaushak",85.1,Gender.MALE,LocalDate.of(2025,10, 29));
		Student ob4 = new Student(105,"Omkar",30.0,Gender.FEMALE,LocalDate.of(2026,8, 9));
		
		List<Student> list = new ArrayList<>();
		list.add(ob1);
		list.add(ob2);
		list.add(ob3);
		list.add(ob4);
		
		List<Student> update = studentService.saveAll(list);
		printStudents(update);
*/		
/*
 		List<Student> list = List.of(new Student(102,"Pradeep",90.1,Gender.MALE,LocalDate.of(2024,11, 29)),
 									new Student(103,"Aniket",70.1,Gender.MALE,LocalDate.of(2022,12, 2)),
 									new Student(104,"Kaushak",85.1,Gender.MALE,LocalDate.of(2025,10, 29)),
 									new Student(105,"Omkar",30.0,Gender.FEMALE,LocalDate.of(2026,8, 9)));
 		List<Student> update = studentService.saveAll(list);
		printStudents(update);							
 */
/*		
		//Test Code for Count Student
		Long cnt = studentService.countStudent();
		if(cnt == 0)
		{
			System.out.println("Student Not Found !!");
		}
		else
		{
			System.out.println("Count of Student : "+cnt);
		}
*/
/*
		//Test Code for Student is present or not
		
		if(studentService.existStudentById(110))
		{
			System.out.println("Student is Present !!");
		}
		else
		{
			System.out.println("Student Not Found !!");
		}
*/
/*		
		//Test Code for fetch All Student By Id
		List<Student> list = studentService.fetchAllStudentById(101);
		if(list.isEmpty())
		{
			System.out.println("Record Not Found !!");
		}
		else
		{
			printStudents(list);
		}
*/
		
	}
		
}
