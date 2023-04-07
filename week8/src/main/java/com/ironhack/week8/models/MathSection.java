package com.ironhack.week8.models;

import jakarta.persistence.*;

@Entity
public class MathSection extends Section{

    private Integer mathCredits;

    public MathSection(String id, Integer roomNum, Integer enrolled, String instructor, Integer capacity, Course course, Integer mathCredits) {
        super(id, roomNum, enrolled, instructor, capacity, course);
        this.mathCredits = mathCredits;
    }

    public MathSection() {

    }

    public Integer getMathCredits() {
        return mathCredits;
    }

    public void setMathCredits(Integer mathCredits) {
        this.mathCredits = mathCredits;
    }
}
