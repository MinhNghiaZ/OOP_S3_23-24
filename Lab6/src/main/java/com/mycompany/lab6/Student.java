/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Student {
    private String studentId;
    private String lastName;
    private String midName;
    private String firstName;
    private int yearOfBirth;
    private String gender;
    private String schoolStage;

    public Student() {
    }

    public Student(String studentId, String lastName, String midName, String firstName, int yearOfBirth, String gender, String schoolStage) {
        this.studentId = studentId;
        this.lastName = lastName;
        this.midName = midName;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.schoolStage = schoolStage;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSchoolStage() {
        return schoolStage;
    }

    public void setSchoolStage(String schoolStage) {
        this.schoolStage = schoolStage;
    }
    

    
}
