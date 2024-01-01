package com.foodapp.foodapp.controller;

import com.foodapp.foodapp.model.Food;
import com.foodapp.foodapp.model.Order;
import com.foodapp.foodapp.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/orders")
    public List<Order> getAllOrders(){
        return this.orderService.getAllOrders();
    }


    @PostMapping("/orders")
    public Order createOrder(@RequestBody Order order) {
        Order order1=new Order();
        return orderService.saveOrder(order1);
    }


}
