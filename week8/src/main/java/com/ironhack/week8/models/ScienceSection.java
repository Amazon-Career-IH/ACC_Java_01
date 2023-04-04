package com.ironhack.week8.models;

import jakarta.persistence.*;

@Entity
public class ScienceSection extends Section{
    private Integer scienceCredits;
    private Integer labRoomNum;

    public ScienceSection(String courseCode, Integer roomNumber, Integer enrolled, String instructor, Integer capacity, Integer scienceCredits, Integer labRoomNumber) {
        super(courseCode, roomNumber, enrolled, instructor, capacity);
        this.scienceCredits = scienceCredits;
        this.labRoomNum = labRoomNumber;
    }

    public ScienceSection() {
    }

    public Integer getScienceCredits() {
        return scienceCredits;
    }

    public void setScienceCredits(Integer scienceCredits) {
        this.scienceCredits = scienceCredits;
    }

    public Integer getLabRoomNum() {
        return labRoomNum;
    }

    public void setLabRoomNum(Integer labRoomNum) {
        this.labRoomNum = labRoomNum;
    }
}
