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
public class PartTimeEmployee extends Employee {
    private int workingHour;
    private int payRate;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int workingHour, int payRate, String employeeId, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeId, employeeName, yearOfBirth, address, phone);
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public PartTimeEmployee(int workingHour, int payRate) {
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public int getPayRate() {
        return payRate;
    }


    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }
    ArrayList<Employee> PartTimeList = new ArrayList();

    public void addPartTimeEmployee() {
        System.out.println("enter number of parttime employee to add:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            PartTimeEmployee e1 = new PartTimeEmployee();
            e1.InputPartTimeEmployee();
            PartTimeList.add(e1);
            System.out.println();
        }
    }

    public void InputPartTimeEmployee() {
        super.InputEmployee();
        System.out.println("enter Working Hour:");
        workingHour = sc.nextInt();
        System.out.println("enter Pay Rate:");
        payRate = sc.nextInt();

    }
    public String OutputPartTimeEmployee() {
        StringBuilder sb = new StringBuilder();
        for (Employee i : PartTimeList) {
            sb.append("ID: "+i.getEmployeeId() + " ").append("Full name: "+i.getEmployeeName() + " ").append("Year of Birth: "+i.getYearOfBirth() + " ").append("Address: "+i.getAddress() + " ").append("Phone: "+i.getPhone() + " ").append("Payment: "+i.getPayment()).append("\n");
        }
        return sb.toString();

    }
    public void printParttime(Employee i){
        StringBuilder sb = new StringBuilder();
        sb.append(i.getEmployeeId() + " ").append(i.getEmployeeName() + " ").append(i.getYearOfBirth() + " ").append(i.getAddress() + " ").append(i.getPhone() + " ").append(i.getPayment()).append("\n");
        System.out.println(sb);
    }
    static Comparator<Employee> compareID = (Employee o1, Employee o2) -> o1.getEmployeeId().compareTo(o2.getEmployeeId());
    static Comparator<Employee> comparePayment = (Employee o1,Employee o2) -> (int) (o1.getPayment() - o2.getPayment());
    public void SearchByID(String ID) {
        int index = Collections.binarySearch(PartTimeList, new PartTimeEmployee(0,0,ID, "", 0, "", ""), compareID);
        if (index == -1) {
            System.out.println("none");
        } else {
            printParttime(PartTimeList.get(index));
            
        }

    }
    public void DeleteByID(String ID) {
        int index = Collections.binarySearch(PartTimeList, new PartTimeEmployee(0,0,ID, "", 0, "", ""), compareID);
        if (index == -1) {
            System.out.println("not found");
        } else {
            PartTimeList.remove(index);
            
        }

    }
    public void EditbyID(String ID) {
        int index = Collections.binarySearch(PartTimeList, new PartTimeEmployee(0,0,ID, "", 0, "", ""), compareID);
        if (index == -1) {
            System.out.println("not found");
        } else {
            String n = PartTimeList.get(index).getEmployeeId();
            PartTimeList.get(index).InputEmployee();
            PartTimeList.get(index).setEmployeeId(n);
            
        }

    }
    public void SearchbyPayment(float min,float max){
        for(Employee e:PartTimeList){
            if(e.getPayment()>=min&&e.getPayment()<=max){
                printParttime(e);
            }
        }
    }
    public void sortEmployee(){
        PartTimeList.sort(comparePayment);
    }
    

    

    @Override
    public String getInfo() {
        return OutputPartTimeEmployee();
    }

    @Override
    public float getPayment() {
        return workingHour*payRate;
    }
    
}
