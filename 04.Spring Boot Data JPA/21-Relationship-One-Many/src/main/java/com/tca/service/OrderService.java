package com.tca.service;

import com.tca.entity.Order;

public interface OrderService 
{
	public Order fetchOrder(Long id);
	public Order updateOrder(Order order);
}
