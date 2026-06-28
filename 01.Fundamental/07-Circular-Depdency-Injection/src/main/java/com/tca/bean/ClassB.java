package com.tca.bean;

public class ClassB 
{
	private ClassA classA;
	
	public void setClassA(ClassA classA)
	{
		this.classA = classA;
	}
	
	public void display()
	{
		System.out.println("I am in B Display !!");
	}
}
