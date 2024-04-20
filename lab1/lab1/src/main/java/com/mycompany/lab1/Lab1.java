/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

/**
 *
 * @author Student
 */
public class Lab1 {

    public static void main(String[] args) {
        System.out.println(new Question1(102).SumFirstLastDigit());
        System.out.println(new Question2(123,234,231).MinNumber());
        new Question3(1234).Hailstone();
        Question4 array = new Question4();
        array.Input();
        System.out.println(array.SumEvenNumber());
        Question5 array2 = new Question5();
        array2.InputArrayList();
        System.out.println(array2.Contain());
        System.out.println(array2.AddElement());
        System.out.println(array2.DublicateElement());
        System.out.println(array2.DublicateElementRemove());
        Question6 a = new Question6();
        a.Input();
        System.out.println(a.StringLength());
        System.out.println(a.CountNumberOfWord());
        System.out.println(a.Concatenate());
        
        
    }
   
}
