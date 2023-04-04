package com.ironhack.week8.models;

import jakarta.persistence.*;

@Entity
public class MathSection extends Section{

    private Integer mathCredits;

    public MathSection(String courseCode, Integer roomNumber, Integer enrolled, String instructor, Integer capacity, Integer mathCredits) {
        super(courseCode, roomNumber, enrolled, instructor, capacity);
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
