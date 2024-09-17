package com.vamshi.WebApp.service;

import com.vamshi.WebApp.Repository.ProductRepo;
import com.vamshi.WebApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    ProductRepo repo;

    @Autowired
    private ProductService(ProductRepo repo){
        this.repo = repo;
    }

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId) {

        return repo.findById(prodId)
                .orElseThrow(() -> new IllegalArgumentException("Product not found"));
    }

    public void addProduct(Product product){
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product); // If the data is not there it will create
    }


    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

}
