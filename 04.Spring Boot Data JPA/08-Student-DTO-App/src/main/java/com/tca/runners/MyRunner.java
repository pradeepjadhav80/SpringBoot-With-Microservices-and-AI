package com.tca.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.dto.StudentDTO;
import com.tca.service.StudentService;

@Component
public class MyRunner implements ApplicationRunner
{
	@Autowired
	StudentService service;

	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		List<StudentDTO> list = service.findStudentNamePerGender();
		
		for(StudentDTO ob : list)
		{
			System.out.println("Name       : "+ob.getName());
			System.out.println("Percentage : "+ob.getPer());
			System.out.println("Gender     : "+ob.getGender());
			System.out.println("-".repeat(50));
		}

	}

}
