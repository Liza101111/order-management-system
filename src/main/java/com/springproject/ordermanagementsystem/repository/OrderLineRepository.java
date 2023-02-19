package com.springproject.ordermanagementsystem.repository;

import com.springproject.ordermanagementsystem.entity.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {

 /*   @Query("update from OrderLine o set o.quantity = ?2 where o.id = ?1")
    @Modifying
    @Transactional
    void updateQuantity(Long id, int quantity);*/
}
