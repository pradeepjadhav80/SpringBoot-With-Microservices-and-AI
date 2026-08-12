package com.tca.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tca.model.Student;

@Configuration
@ComponentScan(value="com.tca")
public class AppConfig 
{
	Map<String,Student> getStudentStore()
	{
		Student s1 = new Student("Pradeep","Beed",90.2);
		Student s2 = new Student("Pradeep","Beed",90.2);
		
		Map<String,Student> hmob = new HashMap<>();
		
		hmob.put("SB-1", s1);
		hmob.put("SB-2", s2);
		
		return hmob;
	}
}
