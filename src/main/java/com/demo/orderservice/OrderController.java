package com.demo.orderservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	OrderDao order=new OrderDao();
	
	@GetMapping("/order")
	public List<Order> getAllOrders()
	{
		return order.getOrders();
	}
	@GetMapping("/hello-message")
	public HelloWorld HelloBeanMessage() {
		return new  HelloWorld("This is a Hello Bean Message");
	}
	

}
