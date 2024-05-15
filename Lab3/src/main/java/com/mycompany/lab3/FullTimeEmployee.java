/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    
    public String OutputFullTimeEmployee() {
        StringBuilder sb = new StringBuilder();
        for (Employee i : FullTimeList) {
            sb.append("ID: "+i.getEmployeeId() + " ").append("Full name: "+i.getEmployeeName() + " ").append("Year of Birth: "+i.getYearOfBirth() + " ").append("Address: "+i.getAddress() + " ").append("Phone: "+i.getPhone() + " ").append("Payment: "+i.getPayment()).append("\n");
        }
        return sb.toString();

    }
    public void printFulltime(Employee i){
        StringBuilder sb = new StringBuilder();
        sb.append(i.getEmployeeId() + " ").append(i.getEmployeeName() + " ").append(i.getYearOfBirth() + " ").append(i.getAddress() + " ").append(i.getPhone() + " ").append(i.getPayment()).append("\n");
        System.out.println(sb);
    }
    static Comparator<Employee> compareID = (Employee o1, Employee o2) -> o1.getEmployeeId().compareTo(o2.getEmployeeId());
    static Comparator<Employee> comparePayment = ((Employee o1,Employee o2) -> (int) (o1.getPayment() - o2.getPayment()));
    public void SearchByID(String ID) {
        int index = Collections.binarySearch(FullTimeList, new FullTimeEmployee(ID, "", 0, "", ""), compareID);
        if (index == -1) {
            System.out.println("none");
        } else {
            printFulltime(FullTimeList.get(index));
            
        }

    }
    public void DeleteByID(String ID) {
        int index = Collections.binarySearch(FullTimeList, new FullTimeEmployee(ID, "", 0, "", ""), compareID);
        if (index == -1) {
            System.out.println("not found");
        } else {
            FullTimeList.remove(index);
            
        }

    }
    public void EditbyID(String ID) {
        int index = Collections.binarySearch(FullTimeList, new FullTimeEmployee(ID, "", 0, "", ""), compareID);
        if (index == -1) {
            System.out.println("not found");
        } else {
            String n = FullTimeList.get(index).getEmployeeId();
            FullTimeList.get(index).InputEmployee();
            FullTimeList.get(index).setEmployeeId(n);
            
        }

    }
    public void SearchbyPayment(float min,float max){
        for(Employee e:FullTimeList){
            if(e.getPayment()>=min&&e.getPayment()<=max){
                printFulltime(e);
            }
        }
    }
    public void sortEmployee(){
        FullTimeList.sort(comparePayment);
    }
    
    

    @Override
    public String getInfo() {
        return OutputFullTimeEmployee();

    }

    @Override
    public float getPayment() {
        return salary;
    }

}
