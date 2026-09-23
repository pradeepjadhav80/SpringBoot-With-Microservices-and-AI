package com.tca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Order;
import com.tca.repository.OrderRepository;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public Order fetchOrder(Long id) {
		
		return orderRepository.findById(id).get();
	}

	@Override
	public Order updateOrder(Order order) 
	{
		return orderRepository.save(order);
	}

}
