package com.springproject.ordermanagementsystem.service;

import com.springproject.ordermanagementsystem.entity.OrderLine;
import com.springproject.ordermanagementsystem.repository.OrderLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderLineService {
    @Autowired
    private OrderLineRepository orderLineRepository;

    public List<OrderLine> listAllOrderLine() {

        return orderLineRepository.findAll();
    }

    private void createOrderLine(OrderLine orderLine){
        orderLineRepository.save(orderLine);
    }

}
