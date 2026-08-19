package com.tca;

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
		 ApplicationContext context = SpringApplication.run(Application.class, args);
		 
		 Student ob = new Student(102,"Aniket",80.1,"Pune");
		 
		 StudentRepository rp = context.getBean(StudentRepository.class);
		 int status = rp.saveStudent(ob);
		 
		 if(status == 0)
		 {
			 System.out.println("Record is Not Saved !!");
		 }
		 else
		 {
			 System.out.println("Record is saved successfully !!");
		 }
		 
	}

}
