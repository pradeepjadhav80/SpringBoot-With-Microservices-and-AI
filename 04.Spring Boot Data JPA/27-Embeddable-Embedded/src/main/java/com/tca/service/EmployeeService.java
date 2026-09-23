package com.tca.service;

import com.tca.entity.Employee;

public interface EmployeeService 
{
	public Employee saveEmployee(Employee employee);
	public Employee fetchEmployeeById(Long id);
	public void removeEmployeeById(Long id);
}
