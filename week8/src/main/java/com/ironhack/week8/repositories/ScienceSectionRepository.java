package com.ironhack.week8.repositories;

import com.ironhack.week8.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface ScienceSectionRepository extends JpaRepository<ScienceSection, String> {
}
