package com.ironhack.week9.dto;

import jakarta.validation.constraints.*;

import java.math.*;

public class UpdatePriceDTO {
    @NotNull
    private Long id;
    @NotNull
    @DecimalMin(value = "0.0", message = "Can't add products with a price lower than 0")
    @DecimalMax(value = "1000.0", message = "Can't add products with a price higher than 1000")
    private BigDecimal price;


    public UpdatePriceDTO(Long id, BigDecimal price) {
        this.id = id;
        this.price = price;
    }

    public UpdatePriceDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
