package com.tca.bean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A 
{
	//@Autowired
	static B b;
	
	public A()
	{
		System.out.println("A Bean is Created !!");
	}
/*	
	@Autowired
	public A(B b)
	{
		this.b = b;
		System.out.println("Depdency is Injected Using Constructor !!");
	}
*/
	
	
	@Autowired
	public void setB(B b)
	{
		this.b = b;
		System.out.println("Depdency is Injected Using Setter !!");
	}
}
