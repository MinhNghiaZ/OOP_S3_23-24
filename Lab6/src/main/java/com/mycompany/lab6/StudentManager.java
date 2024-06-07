/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class StudentManager {
    ArrayList<Student> sList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    static Comparator<Student> compareID=(o1, o2) -> o1.getStudentId().compareTo(o2.getStudentId());
    public Student findStudentById(String studentID){
        int index = Collections.binarySearch(sList, new Student(studentID,"","","",0,"",""),compareID);
        if(index<0){
            return null;
        }
        return sList.get(index);
    }
    public boolean addStudent(Student stu){
        String studentID = stu.getStudentId();
        int index = Collections.binarySearch(sList, new Student(studentID,"","","",0,"",""),compareID);
        if(index<0){
            sList.add(stu);
            return true;
        }
        return false;
    }
    public ArrayList<Student> getListStudent(){
        return sList;
    }
    public void Remove(String studentID){
        int index = Collections.binarySearch(sList, new Student(studentID,"","","",0,"",""),compareID);
        sList.remove(index);
    }
    public void WriteFile() {
        try {
            FileOutputStream f = new FileOutputStream("student.dat");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (Student s : sList) {
                oStream.writeObject(s);
            }
            oStream.close();
        } catch (Exception e) {
            System.out.println("Error Write file");
        }
    }
    
    public void ReadFile() {
        try {
            FileInputStream f = new FileInputStream("student.dat");
            ObjectInputStream inStream = new ObjectInputStream(f);
            Student st = null;
            while ((st = (Student) inStream.readObject()) != null) {
                sList.add(st);
            }
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error Read File");
        }
    }
}
