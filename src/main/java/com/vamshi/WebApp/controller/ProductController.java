package com.vamshi.WebApp.controller;

import com.vamshi.WebApp.model.Product;
import com.vamshi.WebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Product getProductByID(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){ // @RequestBody annotation - to get the json in body
        service.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }

}
