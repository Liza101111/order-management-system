package com.springproject.ordermanagementsystem.repository;

import com.springproject.ordermanagementsystem.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
