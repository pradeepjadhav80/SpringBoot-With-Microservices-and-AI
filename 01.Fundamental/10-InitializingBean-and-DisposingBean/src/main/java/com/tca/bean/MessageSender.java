package com.tca.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageSender implements InitializingBean,DisposableBean
{
	private String message;
	
	public MessageSender()
	{
		System.out.println("Default Constructor Injection !!");
	}
	
	public MessageSender(String message)
	{
		this.message = message;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	
	//There are 3 ways to define init and destroy methods in spring
	//1. Through interfaces InitializingBean and DisposingBean
	//2. Through custom method
	//3. Through annotations @PostConstruct and @PreDestroy
	
	//Priority will be first for the interface and then custom method
	//annotaions has highest proiriy
	
	
	 // Using interfaces InitializingBean and DisposableBean to define init and destroy methods
    // To use this we have to implements InitializingBean and DisposableBean interfaces in the class
	
	

	@Override
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("HelloWord afterPropertiesSet() !! ");
		
	}

	@Override
	public void destroy() throws Exception 
	{
		System.out.println("HelloWord destroy() !!");
		
	}
	
	public void myInit()
	{
		System.out.println("HelloWord myInit() !!");
	}
	
	public void myDestroy()
	{
		System.out.println("HelloWord myDestroy() !!");
	}
}
