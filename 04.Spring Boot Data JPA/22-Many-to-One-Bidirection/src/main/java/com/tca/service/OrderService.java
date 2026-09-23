package com.tca.service;

import com.tca.entity.Customer;
import com.tca.entity.Order;

public interface OrderService 
{
	public Order saveOrder(Customer customer,Order order);
	public Order fetchOrderById(Long id);
	public Order updateOrderStatus(Order order);
}
