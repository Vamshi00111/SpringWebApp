package com.vamshi.WebApp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
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
    private int id;
    private String name;
    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy") // To change Date Format
    private Date releaseDate;
    private boolean available;
    private int quantity;

    private String imageName;
    private String imageType;
    @Lob // Large Object
    private byte[] imageData;
}