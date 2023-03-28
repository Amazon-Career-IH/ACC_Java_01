package com.ironhack.myfirstspringapp.repositories;

import com.ironhack.myfirstspringapp.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface GradesRepository extends JpaRepository<Grade, Long> {


    @Query("SELECT sectionName, avg(grade) from Grade  group by sectionName order by sectionName")
    List<Object[]> findAverageBySection();

    @Query("SELECT sectionName, avg(grade) from Grade  group by sectionName having avg(grade) > :average order by sectionName")
    List<Object[]> findAverageBySectionHavingMoreThan(@Param("average") Double avg);

    @Query(value = "SELECT section_name, avg(grade) from grade  group by section_name", nativeQuery = true)
    List<Object[]> findAverageBySectionNative();

}
