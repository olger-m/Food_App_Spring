package com.foodapp.foodapp.service;

import com.foodapp.foodapp.model.Food;
import com.foodapp.foodapp.model.Order;
import com.foodapp.foodapp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }


    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

}
