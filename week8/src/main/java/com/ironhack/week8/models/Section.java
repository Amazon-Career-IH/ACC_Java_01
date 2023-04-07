package com.ironhack.week8.models;

import jakarta.persistence.*;

@Entity
@Table(name = "section")
@Inheritance(strategy = InheritanceType.JOINED)
public class Section {
    @Id
    private String id;
    private Integer roomNum;
    private Integer enrolled;
    private String instructor;
    private Integer capacity;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Section() {
    }

    public Section(String id, Integer roomNum, Integer enrolled, String instructor, Integer capacity, Course course) {
        this.id = id;
        this.roomNum = roomNum;
        this.enrolled = enrolled;
        this.instructor = instructor;
        this.capacity = capacity;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
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
