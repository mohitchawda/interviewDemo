package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.OrderLines;
import com.example.demo.services.OrderLinesServices;

@RestController
@RequestMapping("/orderlines")
public class OrderLinesController {
	
	
	OrderLinesServices orderLinesServices;
	
	OrderLinesController(OrderLinesServices orderLinesServices){
		
		this.orderLinesServices= orderLinesServices;
	}
	
	
	@GetMapping
	public List<OrderLines> getOrdersLines(){
		
		return orderLinesServices.getOrderLines();
		
	}

}
