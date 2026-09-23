package com.tca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Employee;
import com.tca.repository.EmployeeRepository;

@Service("employeeServie")
public class EmployeeServiceImpl implements EmployeeService 
{	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) 
	{
		return employeeRepository.save(employee);
	}

	@Override
	public Employee fetchEmployeeById(Long id) 
	{
		return employeeRepository.findById(id).get();
	}

	@Override
	public void removeEmployeeById(Long id) 
	{
		employeeRepository.deleteById(id);
	}

}
