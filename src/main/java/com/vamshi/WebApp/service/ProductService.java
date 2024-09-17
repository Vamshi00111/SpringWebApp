package com.vamshi.WebApp.service;

import com.vamshi.WebApp.Repository.ProductRepo;
import com.vamshi.WebApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

   /* List<Product> products = new ArrayList<>(Arrays.asList(new Product(1001, "Mac Book", 1700),     new Product(1002, "Iphone", 1100),
           new Product(1003, "Lamp", 10))); */
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId) {

        return repo.findById(prodId)
                .orElseThrow(() -> new IllegalArgumentException("Product not found"));
    }

        /*for(Product x: products){
            if(x.getProdId() == prodId){
                return x;
            }
        }
        return null;

        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Product not found"));*/

    public void addProduct(Product product){
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product); // If the data is not there it will create
    }

        /*boolean updated = false;
        for(int i=0; i<products.size(); i++){
            if(product.getProdId() == products.get(i).getProdId()){
                updated = true;
                products.set(i, product);

            }
        }

        if(!updated){
            throw new IllegalArgumentException("Product not found");
        }*/

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
        /*boolean updated = false;
        for(int i=0; i<products.size(); i++){
            if(prodId == products.get(i).getProdId()){
                products.remove(i);
                updated = true;
            }
        }

        if(!updated){
            throw new IllegalArgumentException("Product not found");
        }*/
}
