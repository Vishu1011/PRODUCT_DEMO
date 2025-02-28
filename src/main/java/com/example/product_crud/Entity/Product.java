package com.example.product_crud.Entity;

//import lombok.AllArgsConstructor;
//import lombok.Data;

import jakarta.persistence.*;
//import lombok.NoArgsConstructor;

@Entity
//@Data
//@Table(name="PRODUCT")
//@AllArgsConstructor
//@NoArgsConstructor

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    private String productType;
    private String productDescription;
    private Double price;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
