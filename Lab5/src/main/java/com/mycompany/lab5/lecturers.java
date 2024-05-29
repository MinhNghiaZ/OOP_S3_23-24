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
public class lecturers extends Staff {

    private int aRank;
    private String aDegree;
    private int exp;
    private ArrayList<String> subjectList = new ArrayList<>();
    private double Salary;

    public lecturers(int aRank, String aDegree, int exp, double Salary, String fullName, String dateofBirth, String iD) {
        super(fullName, dateofBirth, iD);
        this.aRank = aRank;
        this.aDegree = aDegree;
        this.exp = exp;
        this.Salary = Salary;
    }

    public lecturers() {
    }

    public int getaRank() {
        return aRank;
    }

    public void setaRank(int aRank) {
        this.aRank = aRank;
    }

    public String getaDegree() {
        return aDegree;
    }

    public void setaDegree(String aDegree) {
        this.aDegree = aDegree;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public ArrayList<String> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<String> subjectList) {
        this.subjectList = subjectList;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    @Override
    public void InputStaff(){
        Scanner sc = new Scanner(System.in);
        super.InputStaff();
        System.out.println("Enter Academic Rank:");
        aRank = sc.nextInt();
        System.out.println("Enter Academic Degree:");
        aDegree = sc.next();
        System.out.println("Number of subject:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter Code:");
            subjectList.add(sc.next());
        }
    }
    @Override
    public void OutputStaff(){
        super.OutputStaff();
        System.out.println("Academic Rank: "+aRank);
        System.out.println("Academic Degree: "+aDegree);
        System.out.println("List of subject: ");
        for(var s:subjectList){
            System.out.println(s);
        }
    }
    @Override
    public double SalaryCal() {
        Salary = (subjectList.size() * exp * 0.12) * 20000;
        return Salary;
    }

}
