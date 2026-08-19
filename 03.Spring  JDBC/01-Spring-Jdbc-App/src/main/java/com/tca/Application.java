package com.tca;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tca.model.Student;
import com.tca.repository.StudentRepository;

@SpringBootApplication
public class Application 
{

	public static void main(String[] args) 
	{
		ApplicationContext context =  SpringApplication.run(Application.class, args);
		
		
		
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		/*
		
		 //Test Case : Insert data
		 
		Student student = new Student(101,"Pradeep",80.20,"Pune"); 
		int status = studentRepository.saveStudent(student);
		
		if(status == 0)
		{
			System.out.println("Faild to Inserted Record !!");
		}
		else
		{
			System.out.println("Record is Inserted successfully !!");
		}
		*/
		/*
		  Test Case :- Deleting Student by Roll No
		  
		int status = studentRepository.deleteStudent(101);
		
		if(status == 0)
		{
			System.out.println("Faild to Delete Record !!");
		}
		else
		{
			System.out.println("Record is Deleted successfully !!");
		}
		*/
		/*
		 Test Case :- Deleting student by city
		
		int status = studentRepository.deleteStudent("Pune");
		if(status == 0)
		{
			System.out.println("Faild to Delete Record !!");
		}
		else
		{
			System.out.println("Record is Deleted successfully !!");
		}
		*/
		/*
		Student student = new Student();
		student.setRno(101);
		student.setName("Aniket");
		student.setPer(10.3);
		student.setCity("Delhi");
		
		int status = studentRepository.updateStudent(student);
		
		if(status == 0)
		{
			System.out.println("Faild to Update Record !!");
		}
		else
		{
			System.out.println("Record is Updated successfully !!");
		}
		*/
		/*
		//Test case:- findById()
		int rno=101;
		Map<String,Object> map = studentRepository.findById(rno);
		
		System.out.println(map);
		*/
		
		/*
		//Test Case:-findAll()
		
		List<Map<String,Object>> lst = studentRepository.findAll();
		System.out.println(lst);
		
		for(Map<String,Object> map : lst)
		{
			System.out.println(map);
		}
		*/
		
		//Test Case :-findByCity()
		
		List<Map<String,Object>> lst = studentRepository.findByCity("Delhi");
		
		for(Map<String,Object> map : lst)
		{
			System.out.println(map);
		}
	}

}
