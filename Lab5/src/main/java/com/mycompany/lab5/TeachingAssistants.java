/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TeachingAssistants extends Staff {
    private int numOfSubject;
    private double salary;

    public TeachingAssistants(int numOfSubject, double salary, String fullName, String dateofBirth, String iD) {
        super(fullName, dateofBirth, iD);
        this.numOfSubject = numOfSubject;
        this.salary = salary;
    }

    public TeachingAssistants() {
    }

    public int getNumOfSubject() {
        return numOfSubject;
    }

    public void setNumOfSubject(int numOfSubject) {
        this.numOfSubject = numOfSubject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void InputStaff(){
        Scanner sc = new Scanner(System.in);
        super.InputStaff();
        System.out.println("Number of subject:");
        numOfSubject = sc.nextInt();
        
    }
    @Override
    public void OutputStaff(){
        super.OutputStaff();
        System.out.println("Number of subject: "+numOfSubject);
    }

    @Override
    public double SalaryCal() {
        salary = (numOfSubject* 0.3) * 18000;
        return salary;
    }

    
    
}
