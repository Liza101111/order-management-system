package com.springproject.ordermanagementsystem.repository;

import com.springproject.ordermanagementsystem.entity.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {
}
