package com.ironhack.week9.controllers;

import com.ironhack.week9.dto.*;
import com.ironhack.week9.enums.*;
import com.ironhack.week9.models.*;
import com.ironhack.week9.repositories.*;
import com.ironhack.week9.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.*;

import java.math.*;
import java.util.*;


@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/hola", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String sayHi() {
        return "Hola clase";
    }

    @GetMapping(value = "/mostrar-productos")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> showAllProducts() {
        return productService.showAllProducts();
    }

    @GetMapping(value = "/mostrar-productos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @GetMapping(value = "/mostrar-productos-filtrados")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> showAllProducts(@RequestParam Optional<String> department, @RequestParam Optional<String> category) {
        return productService.showAllProducts(department, category);
    }

    @GetMapping(value = "/mostrar-productos-filtrados/categoria/{category}")
    public List<Product> findByCategory(@PathVariable String category) {
        return productService.findByCategory(category);
    }

    @PostMapping(value = "/añadir-producto")
    @ResponseStatus(HttpStatus.CREATED)
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);

    }
    @PutMapping(value = "/añadir-producto")
    @ResponseStatus(HttpStatus.CREATED)
    public Product putProduct(@RequestBody Product product) {
        return productService.updateProductOrCreate(product);

    }

    @GetMapping(value = "save-from-memory")
    public Product saveFromMemory() {
        Product product1 = new Product();
        product1.setName("Jaume");
        return productService.addProduct(product1);
    }

    @PatchMapping(value = "/update-product")
    public Product updateProduct(@RequestBody UpdatePriceDTO updatePriceDTO) {
        return productService.updateProduct(updatePriceDTO);
    }

    @DeleteMapping(value = "/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

}
