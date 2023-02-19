package com.springproject.ordermanagementsystem.exception;

import com.springproject.ordermanagementsystem.entity.OrderLine;

public class OrderLineNotFoundException extends Exception {
    public OrderLineNotFoundException(String messages) {
        super(messages);
    }
}
