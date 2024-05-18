/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class CollegeStudent extends Student {
    private double examScore;

    public CollegeStudent(double examScore) {
        this.examScore = examScore;
    }

    public CollegeStudent(double examScore, String studentNum, String fullName, int credit, double score) {
        super(studentNum, fullName, credit, score);
        this.examScore = examScore;
    }

    public CollegeStudent() {
    }

    public double getExamScore() {
        return examScore;
    }

    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }
    public void InputCollegeStudent(){
        Scanner sc = new Scanner(System.in);
        super.InputStudent();
        System.out.println("exam score: ");
        examScore = sc.nextDouble();
    }
    
    
    @Override
    public boolean Graduation() {
        return true;
    }
    
}
