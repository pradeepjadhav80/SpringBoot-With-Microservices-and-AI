package com.tca.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class ServiceA 
{
	public ServiceA()
	{
		System.out.println("I am in ServieA Constructor !!");
	}
}
