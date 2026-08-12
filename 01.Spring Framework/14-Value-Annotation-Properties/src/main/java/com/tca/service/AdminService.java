package com.tca.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AdminService 
{
	@Value("${admin.url}")
	private String adminURL;
	
	@Value("${admin.port}")
	private int port;
	
	@Value("${admin.user}")
	private String userName;
	
	@Value("${admin.password}")
	private String password;
	
	public AdminService()
	{
		System.out.println("I am in Default Constructor !!");
	}
	
	public void printInformation()
	{
		System.out.println("You are connected to  : "+adminURL);
		System.out.println("Port                  : "+port);
		System.out.println("User Name             : "+userName);
		System.out.println("Password              : "+password);
	}
}


//--> @Autowired is used to inject Class Type variables.
//--> @Autowired can not inject primitive types variables(Primitive Depenedcies).
//	So to inject primitive type values like int,double, String etc. we must use @Value annotations.
