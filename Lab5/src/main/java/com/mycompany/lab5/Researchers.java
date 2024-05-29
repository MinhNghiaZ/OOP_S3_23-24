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
public class Researchers extends Staff {

    private ArrayList<String> subjectCode = new ArrayList<>();
    private int exp;
    private double salary;

    public Researchers(int exp, double salary, String fullName, String dateofBirth, String iD) {
        super(fullName, dateofBirth, iD);
        this.exp = exp;
        this.salary = salary;
    }

    public Researchers() {
    }

    public ArrayList<String> getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(ArrayList<String> subjectCode) {
        this.subjectCode = subjectCode;
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

    public double codeWithD() {
        double count = 0;
        String x = "D";
        for (int i = 0; i < subjectCode.size(); i++) {
            char a = subjectCode.get(i).charAt(0);
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
        System.out.println("Number of subject:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.println("Enter Code:");
                    String s = sc.next();
                    if (s.matches("[A-Z]\\d{2}")) {
                        subjectCode.add(s);
                        break;
                    } else {
                        throw new Exception();
                    }

                } catch (Exception e) {
                    System.out.println("Try again");
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
        for(var s:subjectCode){
            System.out.println(s);
        }
        System.out.println("Experience: "+exp);
    }

    @Override
    public double SalaryCal() {
        salary = (exp * 2 + codeWithD()) * 20000;
        return salary;
    }

}
