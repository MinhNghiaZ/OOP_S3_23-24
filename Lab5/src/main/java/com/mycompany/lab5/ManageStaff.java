/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ManageStaff {

    ArrayList<Staff> StaffList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void addLecturers() {
        lecturers L = new lecturers();
        L.InputStaff();
        StaffList.add(L);
    }

    public void addAssistants() {
        TeachingAssistants A = new TeachingAssistants();
        A.InputStaff();
        StaffList.add(A);

    }

    public void addResearchers() {
        Researchers R = new Researchers();
        R.InputStaff();
        StaffList.add(R);

    }

    public void addSpecialist() {
        Specialist S = new Specialist();
        S.InputStaff();
        StaffList.add(S);
    }

    public void OutputStaff() {
        for (var s : StaffList) {
            s.OutputStaff();
        }
    }

    public void WriteFile() {
        try {
            FileOutputStream f = new FileOutputStream("EIUStaff.eiu");
            ObjectOutputStream oj = new ObjectOutputStream(f);
            for (Staff s : StaffList) {
                oj.writeObject(s);
            }
            oj.close();
        } catch (Exception e) {
            System.out.println("Fail");
        }
    }

    public void ReadFile() {
        try {
            FileInputStream f = new FileInputStream("EIUStaff.eiu");
            ObjectInputStream oj = new ObjectInputStream(f);
            Staff s = null;
            while ((s = (Staff) oj.readObject()) != null) {
                StaffList.add(s);
            }
            oj.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("error");
        }

    }

    public void WriteFileTotalSalary(double total) {
        try {
            FileWriter f = new FileWriter("TotalSalary.eiu");
            BufferedWriter B = new BufferedWriter(f);
            B.write("Total Salary: " + total);
            B.close();
        } catch (Exception e) {
            System.out.println("Write Error");
        }

    }

    public void WriteFileTotalSalarybyType(double totalL, double totalT, double TotalR, double TotalS) {
        try {
            FileWriter f = new FileWriter("TotalSalary.eiu");
            BufferedWriter B = new BufferedWriter(f);
            B.write("Total Salary of lecturers: " + totalL + "\n"
                    + "Total Salary of TeachingAssistants: " + totalT + "\n"
                    + "Total Salary of Researchers: " + TotalR + "\n"
                    + "Total Slary of Specialist: " + TotalS);
            B.close();
        } catch (Exception e) {
            System.out.println("Write Error");
        }

    }

    public void WriteHighest(ArrayList<Staff> StaffList2) {
        try {
            FileOutputStream f = new FileOutputStream("HighestPaidStaff.eiu");
            ObjectOutputStream oj = new ObjectOutputStream(f);
            for (int i = 0; i < 3; i++) {
                oj.writeObject(StaffList2.get(i));
            }
            oj.close();
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
    static Comparator<Staff> CompareId = (Staff o1, Staff o2) -> o1.getiD().compareTo(o2.getiD());
    static Comparator<Staff> CompareSalary = (Staff o1, Staff o2) -> Double.compare(o2.SalaryCal(), o1.SalaryCal());

    public void FindEdit() {

        System.out.println("Enter ID: ");
        String ID = sc.next();
        int index = Collections.binarySearch(StaffList, new TeachingAssistants(0, 0.0, "", "", ID), CompareId);
        StaffList.get(index).InputStaff();
    }

    public void Delete() {
        System.out.println("Enter ID: ");
        String ID = sc.next();
        int index = Collections.binarySearch(StaffList, new TeachingAssistants(0, 0.0, "", "", ID), CompareId);
        StaffList.remove(index);
    }

    public void CalculateTotalSalary() {
        double total = 0;
        for (var s : StaffList) {
            total += s.SalaryCal();

        }
        WriteFileTotalSalary(total);

    }

    public void CalculateTotalSalaryByType() {
        double totalL = 0;
        double totalT = 0;
        double totalR = 0;
        double totalS = 0;
        for (var s : StaffList) {
            double salary = s.SalaryCal();
            if (s instanceof lecturers) {
                totalL += salary;
            } else if (s instanceof TeachingAssistants) {
                totalT += salary;
            } else if (s instanceof Researchers) {
                totalR += salary;
            } else {
                totalS += salary;
            }

        }
        WriteFileTotalSalarybyType(totalL, totalT, totalR, totalS);
    }

    public void HighestPaid() {
        ArrayList<Staff> StaffList2 = new ArrayList<>(StaffList);
        StaffList2.sort(CompareSalary);
        WriteHighest(StaffList2);
    }
}
