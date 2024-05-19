/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class StudentMange {

    public StudentMange() {
    }

    Vector<Student> sList = new Vector<>();

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
