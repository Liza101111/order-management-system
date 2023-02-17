package com.springproject.ordermanagementsystem.service;

import com.springproject.ordermanagementsystem.entity.Customer;
import com.springproject.ordermanagementsystem.entity.Product;
import com.springproject.ordermanagementsystem.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAlLProduct() {
        var products = productRepository.findAll();
        log.info("All the products from DB: " + products);

        return products;
    }

    public void createProduct(Product product) {
        var savedProduct = productRepository.save(product);
        log.info("New product: " + savedProduct + "saved!");

    }

}
