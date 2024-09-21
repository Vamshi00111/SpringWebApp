package com.vamshi.WebApp.controller;

import com.vamshi.WebApp.model.Product;
import com.vamshi.WebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    ProductService service;

    @Autowired
    private ProductController(ProductService service){
        this.service = service;
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(service.getProducts(), HttpStatus.OK);
    }
    @GetMapping("/products/{prodId}")
    public ResponseEntity<Product> getProductByID(@PathVariable int prodId){

        Product product = service.getProductById(prodId);
        if(product != null){
            return new ResponseEntity<>(service.getProductById(prodId), HttpStatus.FOUND);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/products/{prodId}/image")
    public ResponseEntity<byte[]> getImagebyId(@PathVariable int prodId){
        try{
            Product product = service.getProductById(prodId);
            byte[] imageFile = product.getImageData();

            return ResponseEntity.ok()
                    .contentType(MediaType.valueOf(product.getImageType()))
                    .body(imageFile); // Have to send the content type for images
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/products")
    public ResponseEntity<?> addProduct(@RequestPart Product product,
                                        @RequestPart MultipartFile imageFile){
        // @RequestBody annotation - to get the json in body
        // @ResquestPart - to get the part of requestbody
        try{
            Product product1 =  service.addProduct(product, imageFile);
            return new ResponseEntity<>(product1, HttpStatus.CREATED); // try and catch for add - no null to check
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }

}
