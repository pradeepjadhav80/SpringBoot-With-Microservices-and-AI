package com.tca;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
		
		System.out.println(Arrays.toString(args));
		
		for(String data:args)
		{
			System.out.println(data);
		}
	}

}
