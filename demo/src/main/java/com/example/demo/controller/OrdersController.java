package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Orders;
import com.example.demo.services.OrdersServices;

@RestController
@RequestMapping("/orders")
public class OrdersController {
	
	private final OrdersServices ordersService;
	
	public OrdersController(OrdersServices ordersService){
		this.ordersService = ordersService;		
	}
	
	
	// Get All Orders
	@GetMapping
	public List<Orders> getAllOrders(){
		return ordersService.getAllOrders();
	}
	
	// Get Orders by ID
	@GetMapping("/{id}")
	public ResponseEntity<Orders> getOrder(@PathVariable int id){
		Optional<Orders> optionalBook = ordersService.findbyId(id);
        if (!optionalBook.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        return ResponseEntity.ok(optionalBook.get());
	}
	

}
