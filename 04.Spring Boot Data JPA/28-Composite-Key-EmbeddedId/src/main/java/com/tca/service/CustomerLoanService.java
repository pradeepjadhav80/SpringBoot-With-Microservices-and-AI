package com.tca.service;

import com.tca.entity.CustomerLoan;
import com.tca.entity.CustomerLoanId;

public interface CustomerLoanService 
{
	public CustomerLoan saveCustomerLoan(CustomerLoan customerLoan);
	public CustomerLoan fetchCustomerLoanById(CustomerLoanId id);
	public void removeCustomerLoan(CustomerLoanId id);
}
