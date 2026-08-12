package com.tca.bean;

public class Student 
{
	private Integer rno;
	private String name;
	private Double fees;
	private String passport;
	
	public Student(Integer rno,String name,Double fees)
	{
		this.rno = rno;
		this.name = name;
		this.fees = fees;
	}
	
	public void setPassport(String passport)
	{
		this.passport = passport;
	}
	
	public Integer getRno()
	{
		return rno;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Double getFees()
	{
		return fees;
	}
	public String getPassport()
	{
		return passport;
	}
}
