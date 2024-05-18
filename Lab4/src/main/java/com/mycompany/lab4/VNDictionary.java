/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Student
 */
public class VNDictionary {
    private String word;
    private String meaning;

    public VNDictionary(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    public VNDictionary() {
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> map1 = new HashMap<>();
    TreeMap<String, String> map2 = new TreeMap<>();
    public void InputDictionary(){
        for(int i=0;i<10;i++){
            System.out.println("enter word:");
            word = sc.nextLine();
            System.out.println("enter meaning: ");
            meaning = sc.nextLine();
            map1.put(word, meaning);
            map2.put(word, meaning);
        }
        
    }
    public void OutputDictionary(){
       
    }
    public boolean Check(String a){
        return map1.containsKey(a);
    }
    public void FindMeaning(String a){
        if(Check(a)){
            System.out.println(map1.get(a));
        }else System.out.println("not found");
        
        
        
        
    }
    public void Dictionary(){
        while(true){
        System.out.println("enter word(press s to stop): ");
        String a = sc.nextLine();
        if(!"s".equals(a)){
            FindMeaning(a);
        }else break;
        }
        
        
    }
    
}
