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
public class Question4 {
    private int[] arrayNumber;

    public Question4() {
    }
    static Scanner sc = new Scanner(System.in);

    public Question4(int[] arrayNumber) {
        this.arrayNumber = arrayNumber;
        
    }
    public void Input(){
        System.out.println("input array length");
        int n = sc.nextInt();
        System.out.println("input array number");
        arrayNumber = new int[n];
        for(int i=0;i<n;i++){
            arrayNumber[i] = sc.nextInt();
        }
        
    }
    public int SumEvenNumber(){
        int total=0;
        for(int i=0;i<arrayNumber.length;i++){
            if(arrayNumber[i]%2!=0){
                total+=arrayNumber[i];
                
            }
        }
        return total;
    }
    
    
    
}
