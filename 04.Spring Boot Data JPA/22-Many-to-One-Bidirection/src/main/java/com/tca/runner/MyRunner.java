package com.tca.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;

import com.tca.entity.Customer;
import com.tca.entity.Order;
import com.tca.service.CustomerService;
import com.tca.service.OrderService;

import jakarta.transaction.Transactional;

@Component
public class MyRunner implements ApplicationRunner
{
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private OrderService orderService;
	
	@Override
	@Transactional
	@Modifying
	public void run(ApplicationArguments args) throws Exception 
	{
/*		
		//Order is Added to Customer....
		
		Order o1 = new Order();
		o1.setOrderId(101L);
		o1.setDatePurchased(LocalDate.now());
		o1.setOrderStatus(OrderStatus.DELIVERED);
		
		Order o2 = new Order();
		o2.setOrderId(102L);
		o2.setDatePurchased(LocalDate.now());
		o2.setOrderStatus(OrderStatus.DELIVERED);
		
		Customer c = new Customer(); 
		c.setName("AAA");
		c.setPhone(9999L);
		
		c.setOrders(	Arrays.asList(o1,o2));
		
		o1.setCustomer(c);
		o2.setCustomer(c);
				
		c = customerService.saveCustomer(c);
		System.out.println("Customer Saved with ID :" + c.getCid());
*/
/*		
		//save Customer
		
		Customer c = new Customer(); 
		c.setName("AAA");
		c.setPhone(9999L);
		customerService.saveCustomer(c);
*/
/*		
		//Fetch customer and save Order
		
		Customer c= customerService.fetchCustomer(1L);
		
		Order o1 = new Order();
		o1.setOrderId(103L);
		o1.setDatePurchased(LocalDate.now());
		o1.setOrderStatus(OrderStatus.DELIVERED);
		//o1.setCustomer(c);
		
		o1 = orderService.saveOrder(c, o1);
		
		Order o2 = new Order();
		o2.setOrderId(104L);
		o2.setDatePurchased(LocalDate.now());
		o2.setOrderStatus(OrderStatus.DELIVERED);
		//o2.setCustomer(c);
				
		o2 = orderService.saveOrder(c, o2);
		
		System.out.println("Orders are Saved !!");
*/		
/*		
		//Fetch customer and  order
		
		Customer c = customerService.fetchCustomer(1l);
		
		System.out.println("Customer ID 	  ==>" + c.getCid());
		System.out.println("Customer Name ==>" + c.getName());
		System.out.println("Customer Phone ==>" + c.getPhone());
		
		System.out.println("----------------------------------------------------------");
		
		List<Order> orders = c.getOrders();
		
		for (Order o : orders)
		{
			System.out.println("Order Id    :" + o.getOrderId());
			System.out.println("Order Date  :" + o.getDatePurchased());
			System.out.println("Order Status:" + o.getOrderStatus());
			System.out.println("=======================================================");
		}
*/
		//Fetch Order and customer
		
		Order o = orderService.fetchOrderById(102L);
		Customer c = o.getCustomer();
		
		System.out.println("Order Id    :" + o.getOrderId());
		System.out.println("Order Date  :" + o.getDatePurchased());
		System.out.println("Order Status:" + o.getOrderStatus());
		System.out.println("=======================================================");
		System.out.println("Customer ID 	  ==> " + c.getCid());
		System.out.println("Customer Name  ==> " + c.getName());
		System.out.println("Customer Phone ==> " + c.getPhone());
	}

}
