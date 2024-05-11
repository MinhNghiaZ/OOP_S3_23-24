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
public class FullTimeEmployee extends Employee {

    private float salary;

    public FullTimeEmployee(float salary, String employeeId, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeId, employeeName, yearOfBirth, address, phone);
        this.salary = salary;
    }

    public FullTimeEmployee(String employeeId, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeId, employeeName, yearOfBirth, address, phone);
    }

    public FullTimeEmployee() {
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    ArrayList<Employee> FullTimeList = new ArrayList();

    public void addFullTimeEmployee() {
        System.out.println("enter number of Full time employee to add:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            FullTimeEmployee e1 = new FullTimeEmployee();
            e1.InputFullTimeEmployee();
            FullTimeList.add(e1);
            System.out.println();
        }
    }

    public void InputFullTimeEmployee() {
        super.InputEmployee();
        System.out.println("enter Salary:");
        salary = sc.nextFloat();

    }
    public void OputFullTimeEmployee(){
        StringBuilder sb = new StringBuilder();
        sb.append(getEmployeeId).append(" ");
    }

    @Override
    public String getInfo() {
        
        return sb.toString();

    }

    @Override
    public float getPayment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
