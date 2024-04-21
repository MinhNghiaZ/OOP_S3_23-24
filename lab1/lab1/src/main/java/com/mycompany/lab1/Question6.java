/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Question6 {

    private String a;

    public Question6() {
    }

    public Question6(String a) {
        this.a = a;
    }
    static Scanner sc = new Scanner(System.in);

    public void Input() {
        System.out.println("input String");
        a = sc.nextLine();

    }

    public int StringLength() {
        int n = a.length();
        return n;
    }

    public int CountNumberOfWord() {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) == (' '))) {
                count++;
            }

        }
        if (count == 0 && a.length() == 0) {
            return 0;
        } else {
            if (count == 0) {
                return ++count;

            } else {
                return count+1;
            }

        }
    }
    public String Concatenate(){
        System.out.println("Enter String to concatenate");
        String a2 = sc.nextLine();
        String a3 = (a+" "+a2);
        return a3;
        
        
    }
    public boolean palindromeCheck(){
        for(int i=0;i<(a.length()/2);i++){
            int k=a.length()-(i+1);
            if(a.charAt(i)!=a.charAt(k)){
                return false;
            }
        }
        return true;
    }
}
