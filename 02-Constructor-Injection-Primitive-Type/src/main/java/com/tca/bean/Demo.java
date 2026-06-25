package com.tca.bean;

public class Demo 
{
	private String msg;
	private Integer id;
	
	public Demo()
	{
		
	}
	public Demo(Integer id,String msg)
	{
		this.id = id;
		this.msg = msg;
	}
	
	public Integer getId()
	{
		return id;
	}
	
	public String getMsg()
	{
		return msg;
	}
}
