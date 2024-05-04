/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Employee {
    private String code;
    private String fullName;
    private int yearOfService;
    private double salaryEff;
    private double basicSalary;

    public Employee() {
    }

    public Employee(String code, String fullName, int yearOfService, double salaryEff, double basicSalary) {
        this.code = code;
        this.fullName = fullName;
        this.yearOfService = yearOfService;
        this.salaryEff = salaryEff;
        this.basicSalary = basicSalary;
    }

    public String getCode() {
        return code;
    }

    public String getFullName() {
        return fullName;
    }

    public int getYearOfService() {
        return yearOfService;
    }

    public double getSalaryEff() {
        return salaryEff;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setYearOfService(int yearOfService) {
        this.yearOfService = yearOfService;
    }

    public void setSalaryEff(double salaryEff) {
        this.salaryEff = salaryEff;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public void InputEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee code: ");
        code = sc.nextLine();
        System.out.println("enter employee full name: ");
        fullName = sc.nextLine();
        System.out.println("enter employee year of service: ");
        yearOfService = sc.nextInt();
        System.out.println("enter employee salary coefficient: ");
        salaryEff = sc.nextInt();
        System.out.println("enter employee basic salary: ");
        basicSalary = sc.nextInt();
    }
    public void OutputEmployee(){
        System.out.println("employee code: "+code);
        System.out.println("employee full name: "+fullName);
        System.out.println("employee year of service: "+yearOfService);
        System.out.println("employee salary coefficient: "+salaryEff);
        System.out.println("employee basic salary: "+basicSalary);
        System.out.println("Salary: "+SalaryCalculate());
        
        
    }
    public double SalaryCalculate(){
        double S;
        S=salaryEff*basicSalary;
        return S;
    }
    
}
