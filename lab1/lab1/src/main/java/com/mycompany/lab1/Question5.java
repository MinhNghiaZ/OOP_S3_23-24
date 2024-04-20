/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Question5 {

    private ArrayList<Integer> array = new ArrayList<>();

    public Question5() {
    }
    static Scanner sc = new Scanner(System.in);

    public void InputArrayList() {
        System.out.println("input array length");
        int n = sc.nextInt();
        System.out.println("input array element");
        for (int i = 0; i < n; i++) {
            array.add(i, sc.nextInt());

        }
    }

    public boolean Contain() {
        System.out.println("enter element need to delete");
        int x = sc.nextInt();
        if (array.contains(x)) {
            array.remove(x);
            return true;

        } else {
            return false;
        }

    }
    public ArrayList<Integer> AddElement(){
        System.out.println("Enter position and element");
        int n = sc.nextInt();
        int a = sc.nextInt();
        array.add(n,a);
        array.remove(array.size()-1);
        return array;
    }
    public ArrayList<Integer> DublicateElement(){
        ArrayList<Integer> array2 = new ArrayList<>();
        for(int i=0;i<array.size();i++){
            int count =0;
            for(int k=0;k<array.size();k++){
                int a=array.get(i);
                int b=array.get(k);
                if(a==b){
                   count++;
                    
                }
            }
            
            if((count>1)){
                if(array2.contains(array.get(i))){
                continue;
            }
                array2.add(array.get(i));
            }
        }
        return array2;
    }
    public ArrayList<Integer> DublicateElementRemove(){
        ArrayList<Integer> array2 = new ArrayList<>();
        for(int i=0;i<array.size();i++){
            int count =0;
            for(int k=1;k<array.size();k++){
                int a=array.get(i);
                int b=array.get(k);
                if(a==b){
                    count++;
                    
                }
            }
            if((count>0)&&(array2.contains(array.get(i))==false)){
                array2.add(array.get(i));
            }
        }
        return array2;
    }

}
