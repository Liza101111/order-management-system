package com.springproject.ordermanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
