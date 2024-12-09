package com.telusko.ecom_projectpractice.repository;

import com.telusko.ecom_projectpractice.model.Product;
import com.telusko.ecom_projectpractice.service.ProductService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
