package com.springproject.ordermanagementsystem.controller;
import com.springproject.ordermanagementsystem.entity.Product;
import com.springproject.ordermanagementsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String showProductList(Model model) {
        List<Product> productList = productService.listAlLProduct();
        model.addAttribute("listProducts", productList);
        return "product";
    }

    @GetMapping("/products/new")
    public String addNewProduct(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("pageTitle", "Add New Product");
        return "add_product";
    }

    @PostMapping("/products/save")
    public String saveProduct(Product product, RedirectAttributes attributes) {
        productService.createProduct(product);
        attributes.addFlashAttribute("message", "The new product has been saved!");
        return "redirect:/products";
    }
}
