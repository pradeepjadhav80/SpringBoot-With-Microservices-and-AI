package com.tca.bean;

public class Customer 
{
	private Integer customerId;
	private String customerName;
	private Address address;
	
	public void setCustomerId(Integer customerId)
	{
		this.customerId = customerId;
	}
	
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	
	public void setAddress(Address address)
	{
		this.address = address;
	}
	
	public Integer getCustomerId()
	{
		return customerId;
	}
	
	public String getCustomerName()
	{
		return customerName;
	}
	
	public Address getAddress()
	{
		return address;
	}
}
