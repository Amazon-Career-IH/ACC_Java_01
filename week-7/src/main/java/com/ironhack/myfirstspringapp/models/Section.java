package com.ironhack.myfirstspringapp.models;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Section {
    @Id
    private String sectionId;
    private String courseCode;
    private Integer roomNumber;
    private String professor;

    public Section(String sectionId, String courseCode, Integer roomNumber, String professor) {
        this.sectionId = sectionId;
        this.courseCode = courseCode;
        this.roomNumber = roomNumber;
        this.professor = professor;
    }

    public Section() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section section = (Section) o;
        return Objects.equals(getSectionId(), section.getSectionId()) && Objects.equals(getCourseCode(), section.getCourseCode()) && Objects.equals(getRoomNumber(), section.getRoomNumber()) && Objects.equals(getProfessor(), section.getProfessor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSectionId(), getCourseCode(), getRoomNumber(), getProfessor());
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
