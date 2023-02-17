package com.springproject.ordermanagementsystem.service;

import com.springproject.ordermanagementsystem.entity.Customer;
import com.springproject.ordermanagementsystem.exception.CustomerNotFoundException;
import com.springproject.ordermanagementsystem.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@Slf4j
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> listAllCustomers() {
        var customers = customerRepository.findAll();
        log.info("All the customers from DB: " + customers);

        return customers;
    }

    public void createCustomer(Customer customer) {
        var savedCustomer = customerRepository.save(customer);
        log.info("New customer: " + savedCustomer + "saved!");

    }

    public Customer readCustomerById(Long id) throws CustomerNotFoundException {
        log.info("Read customer with id: " + id);
        var customerById = customerRepository.findById(id);

        return customerById.orElseThrow(() -> new CustomerNotFoundException("Could not find any customer with id: " + id));
    }

    public void deleteCustomer(Long id) throws CustomerNotFoundException {
        log.info("deleting customer with id: " + id);
        if(customerRepository.existsById(id)){
            customerRepository.deleteById(id);
        }else{
            throw new CustomerNotFoundException("Could not find any customer with id:" + id);
        }
    }



}
