package com.ironhack.week9.controllers;

import com.ironhack.week9.enums.*;
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

    @GetMapping(value = "/mostrar-productos-filtrados")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> showAllProducts(@RequestParam Optional<String> department, @RequestParam Optional<String> category) {

        if (department.isPresent() && category.isPresent()) {
            Department department1 = Department.valueOf(department.get().toUpperCase());
            Category category1 = Category.valueOf(category.get().toUpperCase());
            return productRepository.findByDepartmentAndCategory(department1, category1);

        }

        if (department.isPresent()) {
            return productRepository.findByDepartment(Department.valueOf(department.get().toUpperCase()));
        }

        if (category.isPresent()) return productRepository.findByCategory(Category.valueOf(category.get().toUpperCase()));


        return productRepository.findAll();
    }

    @GetMapping(value = "/mostrar-productos-filtrados/categoria/{category}")
    public List<Product> findByCategory(@PathVariable String category) {
        return productRepository.findByCategory(Category.valueOf(category.toUpperCase()));
    }

}
