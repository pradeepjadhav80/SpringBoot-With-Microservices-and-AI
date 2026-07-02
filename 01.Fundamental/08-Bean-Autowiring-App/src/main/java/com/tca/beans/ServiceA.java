package com.tca.beans;

public class ServiceA 
{
	private ServiceB serviceB;
	
	public ServiceA()
	{
		System.out.println("I am In Default Constructor !!");
	}
	
	public ServiceA(ServiceB serviceB)
	{
		this.serviceB = serviceB;
		
		System.out.println("Constructor - Injection !!");
	}
	
	public void setServiceB(ServiceB serviceb)
	{
		this.serviceB = serviceB;
		
		System.out.println("Setter Injection !!");
	}
	public void display()
	{
		serviceB.display();
	}
	
}
