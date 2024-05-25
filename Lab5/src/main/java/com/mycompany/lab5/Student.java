/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public abstract class Student implements Serializable{
    private String studentNum;
    private String fullName;
    private int credit;
    private double score;

    public Student() {
    }

    public Student(String studentNum, String fullName, int credit, double score) {
        this.studentNum = studentNum;
        this.fullName = fullName;
        this.credit = credit;
        this.score = score;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public String getFullName() {
        return fullName;
    }

    public int getCredit() {
        return credit;
    }

    public double getScore() {
        return score;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    public void InputStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Number: ");
        studentNum = sc.nextLine();
        System.out.println("Student Full Name: ");
        fullName = sc.nextLine();
        System.out.println("Student Credit: ");
        credit = sc.nextInt();
        System.out.println("Student score: ");
        score = sc.nextInt();
        
    }
    public void printStudent(){
        System.out.println("Student Number: "+studentNum);
        System.out.println("Student Full Name: "+fullName);
        System.out.println("Student Credit: "+credit);
        System.out.println("Student score: "+score);
    }
    public void CreateFile(){
     
    }
    
    
    
    public abstract boolean Graduation();
        
    
}
