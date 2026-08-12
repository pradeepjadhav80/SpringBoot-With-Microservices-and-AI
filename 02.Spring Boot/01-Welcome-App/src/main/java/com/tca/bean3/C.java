package com.tca.bean3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C 
{
	//@Autowired
	//static final D d;
	
	//It will be not wored Beacause static final 
	
	public C()
	{
		System.out.println("C Bean is Created !!");
	}
	
	
}
