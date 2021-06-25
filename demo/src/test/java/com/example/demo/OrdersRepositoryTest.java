package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.model.Orders;
import com.example.demo.repository.OrderRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class OrdersRepositoryTest {
    
	@Autowired
    private OrderRepository orderRepository;
    private Orders orders;

    @BeforeEach
    public void setUp() {

    	orders = new Orders();
    	orders.setId(4);
    	orders.setOrderTotal("100");
    }

    @AfterEach
    public void tearDown() {
        orderRepository.deleteAll();
        orders = null;
    }


    @Test
    public void GivenGetAllProductShouldReturnListOfAllProducts(){
        Orders order1 = new Orders(5, "123", null, null);
        Orders order2 = new Orders(6, "150", null, null);
        orderRepository.save(order1);
        orderRepository.save(order2);

        List<Orders> orders = (List<Orders>) orderRepository.findAll();
        assertEquals("100", orders.get(1).getOrderTotal());

    }

    @Test
    public void givenIdThenShouldReturnOrderOfThatId() {
    	Orders order1 = new Orders(4, "100", null, null);
    	Orders order2 = orderRepository.save(order1);

        Optional<Orders> optional =  orderRepository.findById(order2.getId());
        assertEquals(order2.getId(), optional.get().getId());
        assertEquals(order2.getOrderTotal(), optional.get().getOrderTotal());
    }




}