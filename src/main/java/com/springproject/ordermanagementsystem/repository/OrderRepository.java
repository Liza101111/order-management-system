package com.springproject.ordermanagementsystem.repository;

import com.springproject.ordermanagementsystem.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
