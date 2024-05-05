/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Manager {

    Scanner sc = new Scanner(System.in);
    ArrayList<Employee> eList = new ArrayList<>();

    public Manager() {
    }

    public void InputList() {
        System.out.println("Enter N employee");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Employee employee = new Employee();
            employee.InputEmployee();
            eList.add(employee);

        }
    }

    public void OutputSalary() {
        for (int i = 0; i < eList.size(); i++) {
            eList.get(i).SalaryCalculate();
            System.out.println();
            eList.get(i).OutputEmployee();
        }
    }

    public void OutputHighest() {
        ArrayList<Employee> eList2 = new ArrayList<>();
        double max = eList.get(0).SalaryCalculate();
        for (int i = 1; i < eList.size(); i++) {
            double S = eList.get(i).SalaryCalculate();
            if (max < S) {
                max = S;
            }
        }
        for (int i = 0; i < eList.size(); i++) {
            double S = eList.get(i).SalaryCalculate();
            if (max == S) {
                max = S;
                eList2.add(eList.get(i));
            }
        }
        System.out.println("highest salary employee: ");
        for (Employee h : eList2) {
            h.OutputEmployee();
        }
        System.out.println();

    }

    public void sortDecending() {
        ArrayList<Employee> eList2 = new ArrayList<>();
        ArrayList<Employee> eList3 = new ArrayList<>(eList);
        while (!eList3.isEmpty()) {
            int k = 0;
            double max = 0;
            for (int i = 0; i < eList3.size(); i++) {
                double S = eList3.get(i).SalaryCalculate();
                if (max <= S) {
                    max = S;
                    k = i;
                }
            }
            eList2.add(eList3.get(k));
            eList3.remove(k);
        }
        System.out.println("Sort Decending: ");
        for (Employee h : eList2) {
            h.OutputEmployee();
        }
        System.out.println();

    }

}
