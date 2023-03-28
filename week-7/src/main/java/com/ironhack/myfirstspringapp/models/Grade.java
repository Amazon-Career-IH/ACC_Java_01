package com.ironhack.myfirstspringapp.models;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String studentName;
    private String sectionName;
    private Integer grade;

    public Grade(String studentName, String sectionName, Integer grade) {
        this.studentName = studentName;
        this.sectionName = sectionName;
        this.grade = grade;
    }

    public Grade() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grades = (Grade) o;
        return Objects.equals(getId(), grades.getId()) && Objects.equals(getStudentName(), grades.getStudentName()) && Objects.equals(getSectionName(), grades.getSectionName()) && Objects.equals(getGrade(), grades.getGrade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStudentName(), getSectionName(), getGrade());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
