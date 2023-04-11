package com.ironhack.week9.repositories;

import com.ironhack.week9.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
