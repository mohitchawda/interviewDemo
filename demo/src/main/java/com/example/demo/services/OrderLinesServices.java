package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.OrderLines;
import com.example.demo.repository.OrderLinesRepository;

@Service
public class OrderLinesServices {

	private final OrderLinesRepository orderlinesRepository;
	
	public OrderLinesServices(OrderLinesRepository orderlinesRepository){
		this.orderlinesRepository = orderlinesRepository;
	}
	
	
	public List<OrderLines> getOrderLines(){
		return orderlinesRepository.findAll();
		
	}
	
	
}
