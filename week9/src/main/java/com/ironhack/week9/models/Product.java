package com.ironhack.week9.models;

import com.ironhack.week9.enums.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.math.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String name;
    @NotNull
    @DecimalMin(value = "0.0", message = "Can't add products with a price lower than 0")
    @DecimalMax(value = "1000.0", message = "Can't add products with a price higher than 1000")
    private BigDecimal price;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Category category;
    @Enumerated(EnumType.STRING)
    private Department department;

    public Product(String name, BigDecimal price, Category category, Department department) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.department = department;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
