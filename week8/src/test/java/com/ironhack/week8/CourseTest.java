package com.ironhack.week8;

import com.ironhack.week8.models.*;
import com.ironhack.week8.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CourseTest {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private SectionRepository sectionRepository;

    private Course course;
    private Section section1;
    private Section section2;

    @BeforeEach
    void setUp() {

        course = courseRepository.save(new Course("CS101", "Intro a Java"));
        section1 = sectionRepository.save(new Section("SEC1", 25, 100, "Jaume", 150, course));
        section2 = sectionRepository.save(new Section("SEC2", 24, 70, "Kiru", 150, course));


    }

    @AfterEach
    void tearDown() {
        sectionRepository.deleteAll();
        courseRepository.deleteAll();
    }

    @Test
    void shouldAddCourseToSections() {
        Course courseTest = courseRepository.findAll().get(0);
        courseTest.setCourseCode("CS102");
        courseRepository.save(courseTest);


        Section section1 = sectionRepository.findAll().get(0);


        /*
            Si está lazy
            Course course  = SELECT course_code, course_name from course... course.setCourseCode(course_code), course.setCourseName(course_name);

            Si está en eager:
            Course course  = SELECT course_code, course_name from course... course.setCourseCode(course_code), course.setCourseName(course_name);
            List<Sections> s = Select * from Section where course_code course.CourseCode.... course.setSections(s);
         */


        assertEquals("CS101", section1.getCourse().getCourseCode());
        assertEquals("SEC1", courseTest.getSections().get(0).getId());


    }

}
