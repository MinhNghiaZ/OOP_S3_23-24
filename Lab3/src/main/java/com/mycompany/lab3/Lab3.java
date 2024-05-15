/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Lab3 {

    public static void main(String[] args) {
//        CD Cd1 = new CD();
//        Cd1.addCD();
//        Cd1.SearchByTitle();
//        Cd1.SearchByCollection();
//        Cd1.SearchByType();
//        Cd1.DeleteID();
//        Cd1.EditByID();
//        Cd1.OutputCD();
//        Cd1.SortAccending();
//        Cd1.OutputCD();
//          FullTimeEmployee e = new FullTimeEmployee();
//          e.addFullTimeEmployee();
//          System.out.println(e.getInfo());
//          e.SearchByID();
        Scanner sc = new Scanner(System.in);
        int choice;
        String ID;
        FullTimeEmployee fullE = new FullTimeEmployee();
        PartTimeEmployee PartE = new PartTimeEmployee();
        do {

            System.out.println("1. Add Full-time Employee (ArrayList)");
            System.out.println("2. Add Part-time Employee (ArrayList)");
            System.out.println("3. Show all Full-time Employee");
            System.out.println("4. Show all Part-time Employee");
            System.out.println("5. Show all Employee");
            System.out.println("6. Search Employee by Id");
            System.out.println("7. Delete Employee by Id");
            System.out.println("8. Edit Employee information by Id");
            System.out.println("9. Search Employee by payment");
            System.out.println("10. Sort Full-time Employee and Part-Time employee in ascending order by age, payment");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    fullE.addFullTimeEmployee();
                    break;
                case 2:
                    PartE.addPartTimeEmployee();
                    break;
                case 3:
                    System.out.println(fullE.getInfo());
                    break;
                case 4:
                    System.out.println(PartE.getInfo());
                    break;
                case 5:
                    System.out.println(fullE.getInfo());
                    System.out.println(PartE.getInfo());
                    break;
                    
                case 6:
                    System.out.println("enter ID to search: ");
                    sc.nextLine();
                    ID = sc.nextLine();
                    fullE.SearchByID(ID);
                    PartE.SearchByID(ID);
                    break;
                case 7:
                    System.out.println("enter ID to delete: ");
                    sc.nextLine();
                    ID = sc.nextLine();
                    fullE.DeleteByID(ID);
                    PartE.DeleteByID(ID);
                    break;
                case 8:
                    System.out.println("enter ID to edit: ");
                    sc.nextLine();
                    ID = sc.nextLine();
                    fullE.EditbyID(ID);
                    PartE.EditbyID(ID);
                    break;
                case 9:
                    System.out.println("Enter payment range:");
                    float min = sc.nextFloat();
                    float max = sc.nextFloat();
                    fullE.SearchbyPayment(min, max);
                    PartE.SearchbyPayment(min, max);
                case 10:
                    fullE.sortEmployee();
                    PartE.sortEmployee();
                    
                    
                    
            }

        } while (choice != 11);

    }
}
