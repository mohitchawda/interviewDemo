package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Orders;
import com.example.demo.repository.OrderRepository;

@Service
public class OrdersServices {

	private final OrderRepository orderRepository;
	
	public OrdersServices(OrderRepository orderRepository){
		this.orderRepository = orderRepository;
	}
	
	
	public List<Orders> getAllOrders(){
		return orderRepository.findAll();
	}
	
	public Optional<Orders> findbyId(int id){
		return orderRepository.findById(id);
	}	
}
