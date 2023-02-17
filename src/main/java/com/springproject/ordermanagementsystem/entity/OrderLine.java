package com.springproject.ordermanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "order_line")
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;

    @ManyToOne(targetEntity = Product.class,fetch = FetchType.LAZY)
    private Product product;
    @ManyToOne(targetEntity = Order.class,fetch = FetchType.LAZY)
    private Order order;

}
