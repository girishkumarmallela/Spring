package com.example.SimpleWebAppPractice.Service;

import com.example.SimpleWebAppPractice.Model.Product;
import com.example.SimpleWebAppPractice.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
@Autowired
  ProductRepo productRepo;

//  public List<Product> products= new ArrayList<>(Arrays.asList(
//          new Product(100,"Bottle",500),
//          new Product(101,"Book",200),
//          new Product(102,"Bag",1000))
//  );

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getById(int prodId) {

      return productRepo.getById(prodId);
    }

  public void addProducts(Product product) {
      productRepo.save(product);
  }

  public void updateProduct(Product  product) {

   productRepo.save(product);
  }

  public void deleteProduct(int id) {
    productRepo.deleteById(id);
  }
}
