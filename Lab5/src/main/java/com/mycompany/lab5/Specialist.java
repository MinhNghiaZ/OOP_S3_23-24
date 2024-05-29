/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Specialist extends Staff {

    private ArrayList<String> projectCode = new ArrayList<>();
    private int exp;
    private double salary;

    public Specialist(int exp, double salary, String fullName, String dateofBirth, String iD) {
        super(fullName, dateofBirth, iD);
        this.exp = exp;
        this.salary = salary;
    }

    public Specialist(int exp, double salary) {
        this.exp = exp;
        this.salary = salary;
    }

    public Specialist() {
    }

    public ArrayList<String> getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(ArrayList<String> projectCode) {
        this.projectCode = projectCode;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double codeWithT() {
        double count = 0;
        String x = "T";
        for (int i = 0; i < projectCode.size(); i++) {
            char a = projectCode.get(i).charAt(0);
            char b = x.charAt(0);
            if (a == b) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void InputStaff() {
        Scanner sc = new Scanner(System.in);
        super.InputStaff();
        System.out.println("Number of project:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.println("Enter Code:");
                    String s = sc.next();
                    if(s.matches("[A-Z]\\d{2}")){
                        projectCode.add(s);
                        break;
                    }else{ throw new Exception();}
                
                } catch (Exception e) {
                    System.out.println("try again");
                }
            }

        }
        System.out.println("Enter Experience:");
        exp = sc.nextInt();

    }
    @Override
    public void OutputStaff(){
        super.OutputStaff();
        System.out.println("List of subject code: ");
        for(var s:projectCode){
            System.out.println(s);
        }
        System.out.println("Experience: "+exp);
    }

    @Override
    public double SalaryCal() {
        salary = (exp * 4 + codeWithT()) * 18000;
        return salary;
    }

}
