package com.vamshi.WebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


@Entity // This is For JPA usage
@Data // Model --> Data
@AllArgsConstructor
@NoArgsConstructor
/* Lombok annotations in Java that combines several commonly
 used annotations to reduce boilerplate code in your classes.
 Like getters and setters etc. */
// will create the constructor with the arguments
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // For the auto generation of ID
    private int prodId;
    private String prodName;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private boolean available;
    private int quantity;
}
