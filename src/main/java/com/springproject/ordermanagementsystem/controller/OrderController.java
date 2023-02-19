package com.springproject.ordermanagementsystem.controller;

import com.springproject.ordermanagementsystem.entity.Customer;
import com.springproject.ordermanagementsystem.entity.Order;
import com.springproject.ordermanagementsystem.service.CustomerService;
import com.springproject.ordermanagementsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private CustomerService customerService;

    @GetMapping("/orders")
    public String showOrderList(Model model) {
        List<Order> orderList = orderService.listAlLOrder();
        model.addAttribute("listOrders", orderList);
        return "order";
    }

    @GetMapping("/orders/new")
    public String addNewOrder(Model model) {
        List<Customer> customerList = customerService.listAllCustomers();
        model.addAttribute("order", new Order());
        model.addAttribute("listCustomers", customerList);
        model.addAttribute("pageTitle", "Add New Order");
        return "add_order";
    }

    @PostMapping("/orders/save")
    public String saveOrder(Order order, RedirectAttributes attributes) {
        orderService.createOrder(order);
        attributes.addFlashAttribute("message", "The new order has been saved!");
        return "redirect:/orders";
    }

}
