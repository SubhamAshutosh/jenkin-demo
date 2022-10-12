package com.college.model;
import jdk.jfr.DataAmount;

import javax.persistence.*;
@Entity
@Table(name="collegedata")
public class CollegeModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "rollNo")
    private int rollNo;
    @Column(name = "name")
    private String name;
    @Column(name = "collegeName")
    private String collegeName;


    public CollegeModel() {
    }

    public CollegeModel(int rollNo, String name, String collegeName) {
        this.rollNo = rollNo;
        this.name = name;
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "CollegeModel{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

}
