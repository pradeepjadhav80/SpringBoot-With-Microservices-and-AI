package com.tca.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Address;
import com.tca.entity.Employee;
import com.tca.service.EmployeeService;

@Component
public class MyRunner implements ApplicationRunner
{
	@Autowired
	private EmployeeService employeService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		
/*		
		//Saving Employee
		Address address = new Address();
		address.setHouseNumber("A-101");
		address.setStreet("414205");
		address.setPinCode("414205");
		address.setCity("Beed");
		
		Employee emp = new Employee();
		emp.setAddress(address);
		emp.setEmpName("Pradeep");
		emp.setSalary(999999.0);
		
		employeService.saveEmployee(emp);
		System.out.println("Employee Saved !!");
*/
/*		
		//Fetch Employee
		
		Employee emp = employeService.fetchEmployeeById(1L);
		System.out.println("Employee Id     : "+emp.getEmpNo());
		System.out.println("Employee Name   : "+emp.getEmpName());
		System.out.println("Employee Salary : "+emp.getSalary());
		System.out.println("-".repeat(50));
		
		Address address = emp.getAddress();
		System.out.println("House Number : "+address.getHouseNumber());
		System.out.println("Street       : "+address.getStreet());
		System.out.println("City         : "+address.getCity());
		System.out.println("Pincode      : "+address.getPinCode());
*/
		//Remove Employee
		employeService.removeEmployeeById(1L);
		System.out.println("Removed Emplyee !!");
	}

}
