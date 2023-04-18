package com.ironhack.week9.services;

import com.ironhack.week9.controllers.*;
import com.ironhack.week9.dto.*;
import com.ironhack.week9.enums.*;
import com.ironhack.week9.models.*;
import com.ironhack.week9.repositories.*;
import jakarta.websocket.server.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.*;

import java.math.*;
import java.util.*;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public String sayHi() {
        return "Hola clase";
    }


    public List<Product> showAllProducts() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        if (productRepository.findById(id).isPresent()) {
            return productRepository.findById(id).get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public List<Product> showAllProducts( Optional<String> department,  Optional<String> category) {

        return getProducts(department, category, productRepository);
    }

    public  List<Product> getProducts(Optional<String> department, Optional<String> category, ProductRepository productRepository) {
        if (department.isPresent() && category.isPresent()) {
            Department department1 = Department.valueOf(department.get().toUpperCase());
            Category category1 = Category.valueOf(category.get().toUpperCase());
            return productRepository.findByDepartmentAndCategory(department1, category1);

        }

        if (department.isPresent()) {
            return productRepository.findByDepartment(Department.valueOf(department.get().toUpperCase()));
        }

        if (category.isPresent())
            return productRepository.findByCategory(Category.valueOf(category.get().toUpperCase()));


        return productRepository.findAll();
    }


    public List<Product> findByCategory(@PathVariable String category) {
        return productRepository.findByCategory(Category.valueOf(category.toUpperCase()));
    }


    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);

    }


    public Product saveFromMemory() {
        Product product1 = new Product();
        product1.setName("Jaume");
        return productRepository.save(product1);
    }

    public Product updateProductOrCreate(Product product) {
        if (productRepository.existsById(product.getId())) {
            Product product1 = productRepository.findById(product.getId()).get();
            product1.setName(product.getName());
            return product1;
        } else {
            return productRepository.save(product);
        }
    }

    public Product updateProduct(UpdatePriceDTO updatePriceDTO) {

        Product product = productRepository.findById(updatePriceDTO.getId()).get();
        product.setPrice(updatePriceDTO.getPrice());
        return productRepository.save(product);

    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
