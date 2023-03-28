package com.ironhack.myfirstspringapp.repositories;

import com.ironhack.myfirstspringapp.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
