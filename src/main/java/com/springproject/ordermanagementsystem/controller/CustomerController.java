package com.springproject.ordermanagementsystem.controller;

import com.springproject.ordermanagementsystem.entity.Customer;
import com.springproject.ordermanagementsystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public String showCustomerList(Model model){
        List<Customer> customerList = customerService.listAllCustomers();
        model.addAttribute("listCustomers", customerList);
        return "customer";
    }

}
