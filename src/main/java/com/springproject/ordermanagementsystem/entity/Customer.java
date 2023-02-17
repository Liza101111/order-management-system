package com.springproject.ordermanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "registration_code", nullable = false, unique = true, length = 45)
    private String registrationCode;
    @Column(name = "full_name",length = 40, nullable = false)
    private String fullName;
    @Column(nullable = false, unique = true, length = 45)
    private String email;
    @Column(length = 30, nullable = false)
    private String telephone;

    @OneToMany(mappedBy = "customer",cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    private List<Order> order;
}
