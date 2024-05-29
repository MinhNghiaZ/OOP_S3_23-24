/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public abstract class Staff implements Serializable {
    private String fullName;
    private String dateofBirth;
    private String iD;

    public Staff(String fullName, String dateofBirth, String iD) {
        this.fullName = fullName;
        this.dateofBirth = dateofBirth;
        this.iD = iD;
    }

    public Staff() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }
    public void InputStaff(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Full Name:");
        fullName = sc.next();
        System.out.println("Enter Date Of Birth:");
        dateofBirth = sc.next();
        System.out.println("Enter ID: ");
        iD = sc.next();
    }
    public void OutputStaff(){
        System.out.println("Fullname: "+fullName);
        System.out.println("Date of Birth: "+dateofBirth);
        System.out.println("ID: "+iD);
        System.out.println("Salary: "+SalaryCal());
    }
    public abstract double SalaryCal();
}
