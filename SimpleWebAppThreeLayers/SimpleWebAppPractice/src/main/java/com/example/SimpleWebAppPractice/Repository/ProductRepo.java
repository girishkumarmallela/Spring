package com.example.SimpleWebAppPractice.Repository;

import com.example.SimpleWebAppPractice.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {



}


