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
public class UniversityStudent extends Student {

    private String thesisName;
    private double thesisScore;

    public UniversityStudent(String thesisName, double thesisScore) {
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public UniversityStudent(String thesisName, double thesisScore, String studentNum, String fullName, int credit, double score) {
        super(studentNum, fullName, credit, score);
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public UniversityStudent() {
    }

    public String getThesisName() {
        return thesisName;
    }

    public double getThesisScore() {
        return thesisScore;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    public void setThesisScore(double thesisScore) {
        this.thesisScore = thesisScore;
    }

    @Override
    public void InputStudent() {
        Scanner sc = new Scanner(System.in);
        super.InputStudent();
        sc.nextLine();
        System.out.println("Student thesis Name: ");
        thesisName = sc.nextLine();
        System.out.println("Student thesis score: ");
        thesisScore = sc.nextDouble();

    }

    @Override
    public void printStudent() {
        super.printStudent();
        System.out.println("Student thesis Name: " + thesisName);
        System.out.println("Student thesis score: " + thesisScore);
    }

    @Override
    public boolean Graduation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
