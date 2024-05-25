/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class StudentMange {

    public StudentMange() {
    }
    
    Vector<Student> sList = new Vector<>();
    
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
    public void WriteFileResult() {
        try {
            FileOutputStream f = new FileOutputStream("result.dat");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (Student s : sList) {
                oStream.writeObject(s);
            }
            oStream.close();
        } catch (Exception e) {
            System.out.println("Error Write file");
        }
    }

    public void ReadFileResult() {
        try {
            FileInputStream f = new FileInputStream("result.dat");
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
    

    public void addCollegeStudent() {
        CollegeStudent c = new CollegeStudent();
        c.InputStudent();
        sList.add(c);

    }

    public void addUniStudent() {
        UniversityStudent u = new UniversityStudent();
        u.InputStudent();
        sList.add(u);
    }
    static Comparator<Student> compareID = (Student o1, Student o2) -> o1.getStudentNum().compareTo(o2.getStudentNum());

    public void removeStudent(String ID) {
        int index = Collections.binarySearch(sList, new CollegeStudent(1.1, ID, "", 0, 1.1), compareID);
        if (index != -1) {
            sList.remove(index);
        }
    }

    public void OutputStudent() {
        for (var k : sList) {
            k.printStudent();
        }
    }

    public void GraduationStudent() {
        int count = 0;
        for (var k : sList) {
            if (k.Graduation()) {
                k.printStudent();
                count++;
            }
        }
        System.out.println("Number of elegible student: " + count);
    }
    static Comparator<Student> Compare = (Student o1, Student o2) -> {
        if (o1 instanceof CollegeStudent && o2 instanceof UniversityStudent) {
            return -1;
        } else if (o1 instanceof UniversityStudent && o2 instanceof CollegeStudent) {
            return 1;
        }
        return o1.getStudentNum().compareTo(o2.getStudentNum());

    };

    public void SearchStudent(String Name) {
        for (Student s : sList) {
            if (s.getFullName().contains(Name)) {
                s.printStudent();
            }
        }
    }

    public void SortStudent() {
        sList.sort(Compare);
    }

}
