package com.vamshi.WebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Model --> Data
/* Lombok annotation in Java that combines several commonly
 used annotations to reduce boilerplate code in your classes.
 Like getters and setters etc. */
 // will create the constructor with the arguments
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;
}
