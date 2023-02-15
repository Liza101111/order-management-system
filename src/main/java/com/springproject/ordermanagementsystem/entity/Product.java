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
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "sku_code")
    private String skuCode;
    @Column(name = "unit_price")
    private double unitPrice;


    /*@OneToMany(targetEntity = OrderLine.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<OrderLine> orderLine;
*/
}
