package com.tca.service;

import com.tca.entity.Customer;

public interface CustomerService 
{
	public Customer saveCustomer(Customer customer);
	public Customer fetchCustomer(Long id);
	public void deleteCustomerById(Long id);
}
