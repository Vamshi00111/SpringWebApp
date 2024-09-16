package com.vamshi.WebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
/* Lombok annotation in Java that combines several commonly
 used annotations to reduce boilerplate code in your classes.
 Like getters and setters etc */

@AllArgsConstructor // will create the constructor with the arguments
public class Product {

    private int prodId;
    private String prodName;
    private int price;
}
