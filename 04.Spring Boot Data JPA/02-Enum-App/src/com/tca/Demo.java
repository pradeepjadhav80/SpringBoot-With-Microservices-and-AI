package com.tca;

import com.tca.entity.Gender;
import com.tca.entity.Student;

public class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println(Gender.MALE);
		
		Student ob = new Student(101,"Pradeep",80.1,Gender.FEMALE);
		
		System.out.println(ob);
		System.out.println(Gender.FEMALE.getValue());
		System.out.println(Gender.FEMALE.getCode());
		System.out.println(Gender.FEMALE.getStatus());
	}
}
