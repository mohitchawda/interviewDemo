package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.OrderLines;

@Repository
public interface OrderLinesRepository extends JpaRepository<OrderLines, String>{

}
