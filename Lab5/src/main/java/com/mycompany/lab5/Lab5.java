/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab5;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Lab5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        StudentMange s = new StudentMange();
        s.ReadFile();
        s.OutputStudent();
        do {
            System.out.println("1. Add a new college student.");
            System.out.println("2. Add a new university student.");
            System.out.println("3. Remove a student by student number.");
            System.out.println("4. Print student list.");
            System.out.println("5. Print the list of students eligible for graduation.");
            System.out.println("6. Sort student list.");
            System.out.println("7. Find student by full name.");
            System.out.println("8. Exit.");
            System.out.print("Enter your choice: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    s.addCollegeStudent();
                    s.WriteFile();
                    break;
                case 2:
                    s.addUniStudent();
                    s.WriteFile();
                    break;
                case 3:
                    System.out.println("Enter ID to remove");
                    String ID = sc.next();
                    s.removeStudent(ID);
                    s.WriteFile();
                case 4:
                    s.OutputStudent();
                    break;
                case 5:
                    s.GraduationStudent();
                    break;
                case 6:
                    s.SortStudent();
                    s.WriteFile();
                    break;
                case 7:
                    System.out.println("Enter Student Fullname to search: ");
                    String Name = sc.next();
                    s.SearchStudent(Name);
                    s.WriteFileResult();
                    s.ReadFileResult();
                    s.OutputStudent();
            }
            
        } while (choose != 8);
        

    }
}
