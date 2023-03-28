package com.ironhack.myfirstspringapp.models;

import com.ironhack.myfirstspringapp.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import java.util.*;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class GradeRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    GradesRepository gradeRepository;
    @Autowired
    SectionRepository sectionRepository;

    List<Course> courses;
    List<Section>sections;
    List<Grade> grades;

    @BeforeEach
    void setUp() {

        courses = courseRepository.saveAll(List.of(
                new Course("CS101", "Intro to java"),
                new Course("CS103", "Databases")
        ));

        sections = sectionRepository.saveAll(List.of(
                new Section("CS101-A", "CS101",  1802, "Balderez"),
                new Section("CS101-B", "CS101",   1650, "Su"),
                new Section("CS103-A", "CS103",  1200, "Rojas"),
                new Section("CS103-B", "CS103",  1208, "Tonno")
        ));

        grades = gradeRepository.saveAll(List.of(
                new Grade("Maya Charlotte", "CS101-A", 98),
                new Grade("James Fields", "CS101-A", 82),
                new Grade("Michael Alcocer", "CS101-B", 65),
                new Grade("Maya Charlotte", "CS103-A", 89),
                new Grade("Tomas Lacroix", "CS101-A", 99),
                new Grade("Sara Bisat", "CS101-A", 87),
                new Grade("James Fields", "CS101-B", 46),
                new Grade("Helena Sepulvida", "CS103-A", 72)
        ));

    }

    @AfterEach
    void tearDown() {
        /*

        gradeRepository.deleteAll();
        sectionRepository.deleteAll();
        courseRepository.deleteAll();
         */
    }

    @Test
    void contextLoads() {

    }

    @Test
    void shouldShowAverageBySectionName() {
        List<Object[]> averageBySectionId = gradeRepository.findAverageBySection();

        assertEquals(3, averageBySectionId.size());
        assertEquals("CS101-A", averageBySectionId.get(0)[0]);
        assertEquals(91.5, averageBySectionId.get(0)[1]);

    }
}
