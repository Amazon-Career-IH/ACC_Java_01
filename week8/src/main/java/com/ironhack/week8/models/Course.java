package com.ironhack.week8.models;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Course {

    @Id
    private String courseCode;
    private String courseName;
    @OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
    private List<Section> sections;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public Course() {
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
}
