package com.ironhack.week8.models;

import jakarta.persistence.*;

@Entity
public class ScienceSection extends Section{
    private Integer scienceCredits;
    private Integer labRoomNum;

    public ScienceSection(String id, Integer roomNum, Integer enrolled, String instructor, Integer capacity, Course course, Integer scienceCredits, Integer labRoomNum) {
        super(id, roomNum, enrolled, instructor, capacity, course);
        this.scienceCredits = scienceCredits;
        this.labRoomNum = labRoomNum;
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
