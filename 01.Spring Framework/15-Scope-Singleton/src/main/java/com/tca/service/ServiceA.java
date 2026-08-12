package com.tca.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
//@Lazy
public class ServiceA 
{
	public ServiceA()
	{
		System.out.println("constructor-ServiceA");
	}
}
