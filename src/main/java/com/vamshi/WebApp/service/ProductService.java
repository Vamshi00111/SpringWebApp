package com.vamshi.WebApp.service;

import com.vamshi.WebApp.Repository.ProductRepo;
import com.vamshi.WebApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
                .orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        return repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product); // If the data is not there it will create
    }


    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

}
