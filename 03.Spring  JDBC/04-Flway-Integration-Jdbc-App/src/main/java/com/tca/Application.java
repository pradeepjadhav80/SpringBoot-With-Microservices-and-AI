package com.tca;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tca.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository repo = context.getBean(StudentRepository.class);
		  
		  
		  List<Map<String, Object>> lst = repo.findAll();
		  System.out.println(lst);
		 
		
		  for(Map<String,Object> map : lst)
		  {
			  System.out.println(map);
		  }
	}

}
