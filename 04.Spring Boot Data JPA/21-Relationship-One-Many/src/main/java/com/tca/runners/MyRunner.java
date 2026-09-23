package com.tca.runners;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Customer;
import com.tca.entity.Order;
import com.tca.entity.OrderStatus;
import com.tca.service.CustomerService;
import com.tca.service.OrderService;

@Component
public class MyRunner implements ApplicationRunner
{
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private OrderService orderService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
/*		
		//Saving Customer 
		
		Order order = new Order();
		order.setOrderId(102L);
		order.setDatePurchased(LocalDate.now());
		
		order.setOrderStatus(OrderStatus.ORDERD);
		
		Customer customer = new Customer();
		
		customer.setName("Aniket");
		customer.setPhone(9080231L);
		customer.setOrders(Arrays.asList(order));
		
		customerService.saveCustomer(customer);
*/
/*		
		//Fetch Customer by ID
		
		Customer customer = customerService.fetchCustomerById(1L);
		System.out.println(customer);
*/

/*		
		//Add Order Using customer.
		
		Customer c = customerService.fetchCustomerById(2L); // 2 BBB 888 null
		
		customerService.updateOrderforCustomer(c.getCid(), new Order(103L, LocalDate.now(), OrderStatus.DELIVERED));
			
		System.out.println("Order is Added for Customer with ID :" + c.getCid());
*/
/*		
		//Fetch Customer by ID
		
		Customer c = customerService.fetchCustomerById(1L);
		System.out.println(c);
*/
/*		
		//Update Delieverd Status Name
		
		Order order = orderService.fetchOrder(101L);
		order.setOrderStatus(OrderStatus.CANCELLED);
	
		//customerService.updateOrderforCustomer(2L,order);
		order = orderService.updateOrder(order);
		System.out.println(order);
*/
/*		
		//Update name of the customer
		Customer c = customerService.fetchCustomerById(2L);
		c.setName("SACHIN");  // Customer name is updated at database too
		customerService.saveCustomer(c);
		System.out.println(c);
*/

/*		
		//Adding order for customer
		Order order = new Order();
		order.setOrderId(105L);
		order.setOrderStatus(OrderStatus.ORDERD);
		order.setDatePurchased(LocalDate.now());
		
		Customer customer = customerService.fetchCustomerById(2L);
		List<Order> list = customer.getOrders();
		list.add(order);
		
		customer = customerService.saveCustomer(customer);
		System.out.println(customer);
*/
		//Customer c = customerService.fetchCustomerById(2L);  // 4   orders=[101] [102]
		//c.getOrders().remove(0);
		
		//Delete Customer
		
		customerService.deleteCustomerById(2L);
	}

}
