package com.tca.entity;

public enum Gender 
{
	MALE("M",101,false),
	FEMALE("F",102,true);
	
	private String value;
	private int code;
	private boolean status;
	
	private Gender(String value,int code,boolean status)
	{
		this.value = value;
		this.code = code;
		this.status = status;
	}
	
	public String getValue()
	{
		return value;
	}

	public int getCode() {
		return code;
	}

	public boolean getStatus() {
		return status;
	}


}	
