/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Student
 */
public class Question3 {
    private long number;

    public Question3() {
    }

    public Question3(int number) {
        this.number = number;
    }
    public long  Hailstone(){
        while(number>1){
            if(number%2==0){
                System.out.println(number+" is even, so we take n/2: "+number/2);
                number/=2;
            }
            else{
                System.out.println(number+" is odd, so we take 3*n+1: "+number/2);
                number=3*number+1;
            }
        }
        return number;
        
    }
    
    
}
