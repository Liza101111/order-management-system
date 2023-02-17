package com.springproject.ordermanagementsystem.service;
import com.springproject.ordermanagementsystem.entity.Order;
import com.springproject.ordermanagementsystem.repository.OrderRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> listAlLOrder() {
        var orders = orderRepository.findAll();
        log.info("All the orders from DB: " + orders);

        return orders;
    }

    public void createOrder(Order order) {
        var savedOrder = orderRepository.save(order);
        log.info("New order: " + savedOrder + "saved!");

    }

}
