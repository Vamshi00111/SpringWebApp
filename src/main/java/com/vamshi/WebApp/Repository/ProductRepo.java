package com.vamshi.WebApp.Repository;

import com.vamshi.WebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
 // Spring Data Jpa is creating a class of this Interface which we use in services
}
