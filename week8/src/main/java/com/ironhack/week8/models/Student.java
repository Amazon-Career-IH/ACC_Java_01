package com.ironhack.week8.models;

import com.ironhack.week8.models.enums.*;
import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "house_assignment_id")
    private HouseAssignment houseAssignment;


    public Student() {
    }

    public Student(String name, HouseAssignment houseAssignment) {
        this.name = name;
        this.houseAssignment = houseAssignment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HouseAssignment getHouseAssignment() {
        return houseAssignment;
    }

    public void setHouseAssignment(HouseAssignment houseAssignment) {
        this.houseAssignment = houseAssignment;
    }
}
