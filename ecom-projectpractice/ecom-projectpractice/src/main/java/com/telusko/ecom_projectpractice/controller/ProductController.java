package com.telusko.ecom_projectpractice.controller;

import com.telusko.ecom_projectpractice.model.Product;
import com.telusko.ecom_projectpractice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {
    @Autowired
   private ProductService productService;

    @RequestMapping("/")
    public String greet(){
        return "Welcome";
    }
    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();

    }
}
