/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class CD {

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

    ArrayList<CD> CDList = new ArrayList();
    Scanner sc = new Scanner(System.in);

    public void addCD(CD newCD) {
        CDList.add(newCD);
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

    public void SearchByTitle() {
        System.out.println("enter title to search: ");
        sc.nextLine();
        String t = sc.nextLine();
        boolean flag = true;
        ArrayList<CD> CDList2 = new ArrayList(CDList);
        while (flag) {
            int index = Collections.binarySearch(CDList2, new CD("", "", "", t, 0, 0), compareTitle);
            if (index == -1) {
                System.out.println("none");
                flag = false;
            } else {
                CDList2.get(index).printCD();
                CDList2.remove(index);
            }
        }

    }

    public void SearchByCollection() {
        System.out.println("enter Collection to search: ");
        String C = sc.nextLine();
        boolean flag = true;
        ArrayList<CD> CDList2 = new ArrayList(CDList);
        while (flag) {
            int index = Collections.binarySearch(CDList2, new CD("", C, "", "", 0, 0), compareCollection);
            if (index == -1) {
                System.out.println("none");
                flag = false;
            } else {
                CDList2.get(index).printCD();
                CDList2.remove(index);
            }
        }

    }

    public void SearchByType() {
        System.out.println("enter Type to search: ");
        String type = sc.nextLine();
        boolean flag = true;
        ArrayList<CD> CDList2 = new ArrayList(CDList);
        while (flag) {
            int index = Collections.binarySearch(CDList2, new CD("", "", type, "", 0, 0), compareType);
            if (index == -1) {
                System.out.println("none");
                flag = false;
            } else {
                CDList2.get(index).printCD();
                CDList2.remove(index);
            }
        }

    }

    public void DeleteID() {
        System.out.println("enter ID to delete: ");
        String ID = sc.nextLine();
        int index = Collections.binarySearch(CDList, new CD(ID, "", "", "", 0, 0), compareID);
        if (index == -1) {
            System.out.println("none");
        } else {
            CDList.remove(index);
        }

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
