package com.example.SimpleWebAppPractice.Controller;

import com.example.SimpleWebAppPractice.Model.Product;
import com.example.SimpleWebAppPractice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductControler {
    @Autowired
    ProductService productService;

    @GetMapping ("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Product getById(@PathVariable int prodId){
        return productService.getById(prodId);
    }
    @PostMapping("/products")
    public void addProducts(@RequestBody Product product){
        productService.addProducts(product);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProducts(@PathVariable int prodId){
        productService.deleteProduct(prodId);
    }
}
