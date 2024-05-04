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
    public void InputList(){
        System.out.println("Enter N employee");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            Employee employee = new Employee();
            employee.InputEmployee();
            eList.add(employee);
            
        }
    }
    public void OutputSalary(){
        for(int i=0;i<eList.size();i++){
            eList.get(i).SalaryCalculate();
            System.out.println();
            eList.get(i).OutputEmployee();
        }
    }
    public void OutputHighest(){
        
    }
    
    
    
}
