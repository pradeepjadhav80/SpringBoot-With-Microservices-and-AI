package com.tca.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.CustomerLoan;
import com.tca.entity.CustomerLoanId;
import com.tca.service.CustomerLoanService;

@Component
public class MyRunner implements ApplicationRunner 
{
	@Autowired
	private CustomerLoanService customerLoanService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		
/*		
		//Customer Loan Save
		CustomerLoanId customerLoanId = new CustomerLoanId();
		customerLoanId.setCustomerId(2L);
		customerLoanId.setLoanId(102L);
		
		CustomerLoan customerLoan = new CustomerLoan();
		customerLoan.setCustomerLoanId(customerLoanId);
		customerLoan.setLaonAmount(9191L);
		customerLoan.setPeriodMonth(11);
		
		customerLoanService.saveCustomerLoan(customerLoan);
		System.out.println("Customer Loan Saved !!");
*/
/*		
		//Fetch Customer
		CustomerLoanId customerLoanId = new CustomerLoanId();
		customerLoanId.setCustomerId(2L);
		customerLoanId.setLoanId(102L);
		
		CustomerLoan customerLoan = customerLoanService.fetchCustomerLoanById(customerLoanId);
		System.out.println("customer Loan Amount : "+customerLoan.getLaonAmount());
		System.out.println("Customer Loan Month  : "+customerLoan.getPeriodMonth());
*/
		//Remove Customer...
		CustomerLoanId customerLoanId = new CustomerLoanId();
		customerLoanId.setCustomerId(2L);
		customerLoanId.setLoanId(102L);
		
		customerLoanService.removeCustomerLoan(customerLoanId);
		System.out.println("Removed successfully !!");
		
	}

}
