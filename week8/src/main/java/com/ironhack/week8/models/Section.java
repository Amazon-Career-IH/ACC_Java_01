package com.ironhack.week8.models;

import jakarta.persistence.*;

@Entity
@Table(name = "section")
@Inheritance(strategy = InheritanceType.JOINED)
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String id;
    private String courseCode;
    private Integer roomNum;
    private Integer enrolled;
    private String instructor;
    private Integer capacity;

    public Section() {
    }

    public Section(String courseCode, Integer roomNumber, Integer enrolled, String instructor, Integer capacity) {
        this.courseCode = courseCode;
        this.roomNum = roomNumber;
        this.enrolled = enrolled;
        this.instructor = instructor;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public Integer getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(Integer enrolled) {
        this.enrolled = enrolled;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
