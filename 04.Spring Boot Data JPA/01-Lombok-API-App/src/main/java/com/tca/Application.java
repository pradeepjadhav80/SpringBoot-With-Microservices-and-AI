package com.tca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tca.model.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
		
		Student ob = new Student(101,"Pradeep",90.1,"Pune");
		Student ob1 = new Student(101,"Pradeep",90.1,"Pune");

		System.out.println(ob.toString());
		System.out.println("-----------------------------------------");
		System.out.println(ob.getRno());
		System.out.println(ob.getName());
		System.out.println(ob.getPer());
		System.out.println(ob.getCity());
		
		Student ob2 = new Student();
		ob2.setRno(101);
		ob2.setName("Omkar");
		ob2.setPer(90.3);
		ob2.setCity("Dubai");
		System.out.println(ob2);
		System.out.println("----------------------------------------------");
		System.out.println("Ob is Equals to ob 2 -> "+(ob==ob2));
		System.out.println("Ob is Equals to ob 1 -> "+ob.equals(ob1));
		
	}

}
