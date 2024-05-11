/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public abstract class Employee {

    

    private String employeeId;
    private String employeeName;
    private int yearOfBirth;
    private String address;
    private String phone;

    public Employee(String employeeId, String employeeName, int yearOfBirth, String address, String phone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
    }
    public Employee() {
    }
    

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    Scanner sc = new Scanner(System.in);
    public void InputEmployee() {
        System.out.print("enter employee ID:");
        employeeId = sc.nextLine();
        System.out.print("enter employeeName:");
        employeeName = sc.nextLine();
        System.out.print("enter CD year of Birth:");
        yearOfBirth = sc.nextInt();
        sc.nextLine();
        System.out.print("enter address:");
        address = sc.nextLine();
        System.out.print("enter phone number");
        phone = sc.nextLine();
    }
    public abstract String getInfo();
    public abstract float getPayment();

}
