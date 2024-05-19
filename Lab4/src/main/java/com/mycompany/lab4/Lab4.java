/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Lab4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VNDictionary dictionary = new VNDictionary();
        dictionary.InputDictionary();
        Instant from = Instant.now();
        dictionary.Dictionary();
        Instant to = Instant.now();
        System.out.println("Milisecond: " + Duration.between(from,to).toMillis());
        
        
        
        int choose =0;
        do {            
            System.out.println("1. TPBank: ");
            System.out.println("2. VietComBank");
            System.out.println("3. exit");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    BankType TP = new BankType();
                    TP.InputTPBank();
                    BankFactory TPBank = new BankFactory();
                    var get = TPBank.getBank(TP);
                    System.out.println(get.GetBankName());
                case 2:
                    BankType VT = new BankType();
                    VT.InputTPBank();
                    BankFactory VTBank = new BankFactory();
                    var get2 = VTBank.getBank(VT);
                    System.out.println(get2.GetBankName());
                    
                    
            }
        } while (choose!=3);
        
        
        
        
        
          StudentMange s = new StudentMange();
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
                      break;
                  case 2:
                      s.addUniStudent();
                      break;
                  case 3:
                      System.out.println("Enter ID to remove");
                      String ID = sc.next();
                      s.removeStudent(ID);
                  case 4:
                      s.OutputStudent();
                      break;
                  case 5:
                      s.GraduationStudent();
                      break;
                  case 6:
                      s.SortStudent();
                      break;
                  case 7:
                      System.out.println("Enter Student Fullname to search: ");
                      String Name = sc.next();
                      s.SearchStudent(Name);
              }
            
        } while (choose!=8);
            
    }
}
