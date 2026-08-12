package com.tca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.tca.bean.Car;
import com.tca.bean.GreetBean;

@SpringBootApplication
//there are three Configuration in the SpringBootApplication
//1.@Configuration 
//2.@EnableAutoConfiguration
//3.ComponentScan

public class Application 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context =  SpringApplication.run(Application.class, args);
		//It is used to start the container 
		//when container start all bean object will be created and store in the container
		//Bean class object will created by the alphabetical order
		
		//System.out.println("Container Name : "+context.getClass().getName());
		
		//WelcomeBean welcomeBean = context.getBean(WelcomeBean.class);
		//welcomeBean.printMessage();
		
		GreetBean greetBean = context.getBean(GreetBean.class);
		
		greetBean.greet();
		
		
		
		//ConfigurableApplicationContext
		System.out.println("Hello !!");
	}
	
	@Bean
	public Car getCar()
	{
		System.out.println("Bean Method is Called to return Car Object........");
		return new Car();
	}

}
