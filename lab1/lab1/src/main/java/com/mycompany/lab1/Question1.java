/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Student
 */
public class Question1 {
    private long number;

    public Question1() {
    }

    public Question1(long number) {
        this.number = number;
    }
    public long SumFirstLastDigit(){
       long LastDigit = number%10;
       long FirstDigit = number;
       while(FirstDigit>9){
           FirstDigit/=10;
       }
       return LastDigit+FirstDigit;
    }
    
}
