package com.telusko.ecom_projectpractice.service;

import com.telusko.ecom_projectpractice.model.Product;
import com.telusko.ecom_projectpractice.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;
    public List<Product> getAllProducts() {
        return productRepo.findAll();

    }
}
