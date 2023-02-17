package com.springproject.ordermanagementsystem.controller;

import com.springproject.ordermanagementsystem.entity.Customer;
import com.springproject.ordermanagementsystem.exception.CustomerNotFoundException;
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

    @GetMapping("/customers/new")
    public String addNewCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("pageTitle", "Add New User");
        return "add_customer";
    }

    @PostMapping("/customers/save")
    public String saveCustomer(Customer customer, RedirectAttributes attributes) {
        customerService.createCustomer(customer);
        attributes.addFlashAttribute("message", "The new customer has been saved!");
        return "redirect:/customers";
    }

    @GetMapping("/customers/update/{id}")
    public String updateCustomer(@PathVariable("id") Long id, Model model, RedirectAttributes attributes){
        try {
            Customer customer = customerService.readCustomerById(id);
            model.addAttribute("customer", customer);
            model.addAttribute("pageTitle", "Edit customer (ID: " + id + ")");
            return "add_customer";
        } catch (CustomerNotFoundException e) {
            attributes.addFlashAttribute("message", e.getMessage());
            return "redirect:/customers";
        }
    }

    @GetMapping("/customers/delete/{id}")
    public String deleteCustomer(@PathVariable("id") Long id, RedirectAttributes attributes){
        try {
            customerService.deleteCustomer(id);
            attributes.addFlashAttribute("message", "The user has been deleted!");

        } catch (CustomerNotFoundException e) {
            attributes.addFlashAttribute("message", e.getMessage());
        }
        return "redirect:/customers";
    }

}
