package com.ironhack.week9.repositories;

import com.ironhack.week9.enums.*;
import com.ironhack.week9.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByDepartmentAndCategory(Department department, Category category);
    List<Product> findByDepartment(Department department);
    List<Product> findByCategory(Category category);
}
