package com.tca.model;

public class Student 
{
	private String name;
	private String city;
	private Double per;
	
	public Student()
	{
		
	}

	public Student(String name, String city, Double per) {
		super();
		this.name = name;
		this.city = city;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", per=" + per + "]";
	}
	
	
}
