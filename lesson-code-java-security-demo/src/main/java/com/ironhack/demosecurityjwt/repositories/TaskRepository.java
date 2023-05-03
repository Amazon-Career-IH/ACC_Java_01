package com.ironhack.demosecurityjwt.repositories;

import com.ironhack.demosecurityjwt.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
