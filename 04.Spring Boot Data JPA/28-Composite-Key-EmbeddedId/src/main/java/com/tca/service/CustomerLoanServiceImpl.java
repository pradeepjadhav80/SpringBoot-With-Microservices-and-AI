package com.tca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.CustomerLoan;
import com.tca.entity.CustomerLoanId;
import com.tca.repository.CustomerLoanRepository;

@Service("customerLoanService")
public class CustomerLoanServiceImpl implements CustomerLoanService 
{
	@Autowired
	private CustomerLoanRepository customerLoanRepository;
	
	@Override
	public CustomerLoan saveCustomerLoan(CustomerLoan customerLoan) 
	{
		return customerLoanRepository.save(customerLoan);
	}

	@Override
	public CustomerLoan fetchCustomerLoanById(CustomerLoanId id) 
	{
		return customerLoanRepository.findById(id).get();
	}

	@Override
	public void removeCustomerLoan(CustomerLoanId id) 
	{
		customerLoanRepository.deleteById(id);
	}
	
}
