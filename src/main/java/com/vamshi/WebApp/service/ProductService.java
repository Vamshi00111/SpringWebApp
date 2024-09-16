package com.vamshi.WebApp.service;

import com.vamshi.WebApp.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(1001, "Mac Book", 1700),
            new Product(1002, "Iphone", 1100),
            new Product(1003, "Lamp", 10)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId){
        /*for(Product x: products){
            if(x.getProdId() == prodId){
                return x;
            }
        }
        return null;*/

        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Product not found"));

    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void updateProduct(Product product) {
        boolean updated = false;
        for(int i=0; i<products.size(); i++){
            if(product.getProdId() == products.get(i).getProdId()){
                updated = true;
                products.set(i, product);

            }
        }

        if(!updated){
            throw new IllegalArgumentException("Product not found");
        }
    }
}
