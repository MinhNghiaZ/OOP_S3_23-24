/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class CD implements Serializable {

    private String CDId;
    private String CDCollection;
    private String CDType;
    private String title;
    private int price;
    private int year;

    public CD() {
    }

    public CD(String CDId, String CDCollection, String CDType, String title, int price, int year) {
        this.CDId = CDId;
        this.CDCollection = CDCollection;
        this.CDType = CDType;
        this.title = title;
        this.price = price;
        this.year = year;
    }

    public String getCDId() {
        return CDId;
    }

    public String getCDCollection() {
        return CDCollection;
    }

    public String getCDType() {
        return CDType;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setCDId(String CDId) {
        this.CDId = CDId;
    }

    public void setCDCollection(String CDCollection) {
        this.CDCollection = CDCollection;
    }

    public void setCDType(String CDType) {
        this.CDType = CDType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    static ArrayList<CD> CDList = new ArrayList();
    static Scanner sc = new Scanner(System.in);

    public boolean addCD(CD newCD) {
        int index = Collections.binarySearch(CDList, new CD(newCD.getCDId(), "", "", "", 0, 0), compareID);
        if (index < 0) {
            CDList.add(newCD);
            return true;
        } else {
            return false;
        }

    }

    public ArrayList<CD> getList() {
        return CDList;
    }

    public void WriteFile(String filename) {
        try {
            FileOutputStream f = new FileOutputStream(filename);
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (CD s : CDList) {
                oStream.writeObject(s);
            }
            oStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ReadFile(String filename) {
        try {
            FileInputStream f = new FileInputStream(filename);
            ObjectInputStream inStream = new ObjectInputStream(f);
            CD st = null;
            while ((st = (CD) inStream.readObject()) != null) {
                CDList.clear();
                CDList.add(st);
            }
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void InputCD() {
        System.out.print("enter CDId:");
        CDId = sc.nextLine();
        System.out.print("enter CD Collection(game/movie/music):");
        CDCollection = sc.nextLine();
        System.out.print("enter CD type(audio or video):");
        CDType = sc.nextLine();
        System.out.print("enter CD title:");
        title = sc.nextLine();
        System.out.print("enter price:");
        price = sc.nextInt();
        System.out.print("enter year of release:");
        year = sc.nextInt();
    }

    public void printCD() {
        System.out.println("CDId: " + CDId);
        System.out.println("CD Collection(game/movie/music): " + CDCollection);
        System.out.println("CD type(audio or video): " + CDType);
        System.out.println("CD title: " + title);
        System.out.println("price: " + price);
        System.out.println("year of release: " + year);
    }

    public void OutputCD() {
        for (int i = 0; i < CDList.size(); i++) {
            CDList.get(i).printCD();
        }
    }
    static Comparator<CD> compareTitle = (CD o1, CD o2) -> o1.getTitle().compareTo(o2.getTitle());
    static Comparator<CD> compareCollection = (CD o1, CD o2) -> o1.getCDCollection().compareTo(o2.getCDCollection());
    static Comparator<CD> compareType = (CD o1, CD o2) -> o1.getCDType().compareTo(o2.getCDType());
    static Comparator<CD> compareID = (CD o1, CD o2) -> o1.getCDId().compareTo(o2.getCDId());
    static Comparator<CD> compareYear = (CD o1, CD o2) -> o1.getYear() - (o2.getYear());

    public ArrayList<CD> SearchByTitle(String t) {
        boolean flag = true;
        ArrayList<CD> CDList2 = new ArrayList(CDList);
        ArrayList<CD> CDList3 = new ArrayList();
        while (flag) {
            int index = Collections.binarySearch(CDList2, new CD("", "", "", t, 0, 0), compareTitle);
            if (index < 0) {
                flag = false;
            } else {
                CDList3.add(CDList2.get(index));
                CDList2.remove(index);
            }
        }
        return CDList3;

    }

    public ArrayList<CD> SearchByCollection(String C) {
        boolean flag = true;
        ArrayList<CD> CDList2 = new ArrayList(CDList);
        ArrayList<CD> CDList3 = new ArrayList();
        while (flag) {
            int index = Collections.binarySearch(CDList2, new CD("", C, "", "", 0, 0), compareCollection);
            if (index < 0) {
                flag = false;
            } else {
                CDList3.add(CDList2.get(index));
                CDList2.remove(index);
            }
        }
        return CDList3;

    }

    public ArrayList<CD> SearchByType(String type) {
        boolean flag = true;
        ArrayList<CD> CDList2 = new ArrayList(CDList);
        ArrayList<CD> CDList3 = new ArrayList();
        while (flag) {
            int index = Collections.binarySearch(CDList2, new CD("", "", type, "", 0, 0), compareType);
            if (index < 0) {
                flag = false;
            } else {
                CDList3.add(CDList2.get(index));
                CDList2.remove(index);
            }
        }
        return CDList3;

    }

    public void DeleteID(int index) {
        CDList.remove(index);

    }

    public void EditByID() {
        System.out.println("enter ID to edit: ");
        String ID = sc.nextLine();
        int index = Collections.binarySearch(CDList, new CD(ID, "", "", "", 0, 0), compareID);
        if (index == -1) {
            System.out.println("can not find CD");
        } else {
            CDList.get(index).ChangeCDInfo();
        }

    }

    public void ChangeCDInfo() {
        System.out.print("enter CD Collection(game/movie/music):");
        CDCollection = sc.nextLine();
        System.out.print("enter CD type(audio or video):");
        CDType = sc.nextLine();
        System.out.print("enter CD title:");
        title = sc.nextLine();
        System.out.print("enter price:");
        price = sc.nextInt();
        System.out.print("enter year of release:");
        year = sc.nextInt();
    }

    public void SortAccending() {
        CDList.sort(compareYear);
    }

}
