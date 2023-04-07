package com.ironhack.week8;

import com.ironhack.week8.models.*;
import com.ironhack.week8.models.enums.*;
import com.ironhack.week8.repositories.*;
import org.aspectj.lang.annotation.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StudentTest {

    HouseAssignment houseAssignment;
    Student student;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    HouseAssignmentRepository houseAssignmentRepository;


    @BeforeEach
    void setUp() {
        houseAssignment = houseAssignmentRepository.save(new HouseAssignment(House.GRYFFINDOR, Wing.EAST, 25, null));
        student = studentRepository.save(new Student("Jaume", houseAssignment));


    }

    @AfterEach
    void tearDown() {
        studentRepository.deleteAll();
        houseAssignmentRepository.deleteAll();
    }

    @Test
    void shouldAddHouseAssignmentToStudent() {
        Student student1 = studentRepository.findAll().get(0);

        assertEquals(House.GRYFFINDOR, student1.getHouseAssignment().getHouse());

        HouseAssignment houseAssignment1 = houseAssignmentRepository.findAll().get(0);

        assertEquals("Jaume", houseAssignment1.getStudent().getName());
    }

}
