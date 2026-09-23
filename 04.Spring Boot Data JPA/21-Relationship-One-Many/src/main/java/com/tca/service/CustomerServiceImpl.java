package com.tca.service;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Customer;
import com.tca.entity.Order;
import com.tca.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService 
{
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public Customer fetchCustomerById(Long id) 
	{
		Optional<Customer> ob = customerRepository.findById(id);
		
		if(ob.isPresent())
		{
			Customer c = ob.get();
			return c;
		}
		else
		{
			return null;
		}
		//return customerRepository.findById(id).get();
	}

	@Override
	public void updateOrderforCustomer(Long cid, Order order) 
	{
		//customerRepository.updateOrder(cid, order.getDatePurchased(), order.getOrderStatus(), order.getOrderId());
		Customer customer = customerRepository.findById(cid).get();
		customer.setOrders(Arrays.asList(order));
		customerRepository.save(customer);
	}

	@Override
	public void deleteCustomerById(Long id) {
		
		customerRepository.deleteById(id);
		
	}

}
