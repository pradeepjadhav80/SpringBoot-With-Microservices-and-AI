package com.tca.bean;

public class ClassA 
{
	private ClassB classB;
	
	public ClassA(ClassB classB)
	{
		this.classB = classB;
	}
	
	public void display()
	{
		System.out.println("I am in A Display !!");
		classB.display();
	}
}
