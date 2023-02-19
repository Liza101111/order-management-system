package com.springproject.ordermanagementsystem.controller;

import com.springproject.ordermanagementsystem.entity.Order;
import com.springproject.ordermanagementsystem.entity.OrderLine;
import com.springproject.ordermanagementsystem.entity.Product;
import com.springproject.ordermanagementsystem.service.OrderLineService;
import com.springproject.ordermanagementsystem.service.OrderService;
import com.springproject.ordermanagementsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class OrderLineController {

    @Autowired
    private OrderLineService orderLineService;
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderService orderService;

    @GetMapping("/orderLines")
    public String showOrderLineList(Model model){
        List<OrderLine> orderLineList = orderLineService.listAllOrderLine();
        model.addAttribute("listOrderLines", orderLineList);
        return "order_line";
    }

    @GetMapping("/orderLines/new")
    public String addNewOrderLine(Model model) {
        List<Product> productList = productService.listAlLProduct();
        List<Order> orderList = orderService.listAlLOrder();
        model.addAttribute("orderLine", new OrderLine());
        model.addAttribute("listProducts", productList);
        model.addAttribute("listOrders",orderList);
        model.addAttribute("pageTitle", "Add New OrderLine");
        return "add_orderLine";

    }

    @PostMapping("/orderLines/save")
    public String saveOrderLine(OrderLine orderLine, RedirectAttributes attributes){
        orderLineService.createOrderLine(orderLine);
        attributes.addFlashAttribute("message", "The new orderLine has been saved!");
        return "redirect:/orderLines";

    }

}
