package com.tca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Customer;
import com.tca.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService 
{
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer saveCustomer(Customer customer) 
	{
		return customerRepository.save(customer);
	}
		
	@Override
	public Customer fetchCustomer(Long id) 
	{
		return customerRepository.findById(id).get();
	}

	@Override
	public void deleteCustomerById(Long id) 
	{
		customerRepository.deleteById(id);
		
	}

}
