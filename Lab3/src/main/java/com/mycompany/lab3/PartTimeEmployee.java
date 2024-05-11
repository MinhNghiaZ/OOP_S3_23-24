/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PartTimeEmployee extends Employee {
    private int workingHour;
    private int payRate;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int workingHour, int payRate, String employeeId, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeId, employeeName, yearOfBirth, address, phone);
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public PartTimeEmployee(int workingHour, int payRate) {
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public int getPayRate() {
        return payRate;
    }


    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }
    ArrayList<Employee> PartTimeList = new ArrayList();

    public void addPartTimeEmployee() {
        System.out.println("enter number of parttime employee to add:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            PartTimeEmployee e1 = new PartTimeEmployee();
            e1.InputPartTimeEmployee();
            PartTimeList.add(e1);
            System.out.println();
        }
    }

    public void InputPartTimeEmployee() {
        super.InputEmployee();
        System.out.println("enter Working Hour:");
        workingHour = sc.nextInt();
        System.out.println("enter Pay Rate:");
        payRate = sc.nextInt();

    }

    

    @Override
    public String getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float getPayment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
