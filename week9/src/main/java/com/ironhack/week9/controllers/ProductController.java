package com.ironhack.week9.controllers;

import com.ironhack.week9.models.*;
import com.ironhack.week9.repositories.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.*;

import java.util.*;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/hola", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String sayHi() {
        return "Hola clase";
    }

    @GetMapping(value = "/mostrar-productos")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> showAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping(value = "/mostrar-productos/{id}")
    public Product findById(@PathVariable Long id) {
        if (productRepository.findById(id).isPresent()) {
            return productRepository.findById(id).get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

}
