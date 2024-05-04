/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class BankAccount {

    private int mAccnum;
    private String mName;
    private double mbalance;

    public BankAccount(int mAccnum, String mName, double mbalance) {
        this.mAccnum = mAccnum;
        this.mName = mName;
        this.mbalance = mbalance;
    }

    public BankAccount() {
    }

    public int getmAccnum() {
        return mAccnum;
    }

    public String getmName() {
        return mName;
    }

    public double getMbalance() {
        return mbalance;
    }

    public void setmAccnum(int mAccnum) {
        this.mAccnum = mAccnum;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setMbalance(double mbalance) {
        this.mbalance = mbalance;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Account number: ");
        mAccnum = sc.nextInt();
        sc.nextLine();
        System.out.println("enter name: ");
        mName = sc.nextLine();
        System.out.println("enter balance: ");
        mbalance = sc.nextInt();
    }

    public void print() {
        System.out.println("Account number: " + mAccnum);
        System.out.println("name: " + mName);
        System.out.println("balance: " + mbalance);

    }

    public void Deposit(Double Money) {
        this.mbalance+=Money;
    }

    public boolean WithDraw(Double WithDraw) {
        if (mbalance >= WithDraw) {
            mbalance -= WithDraw;
            return true;
        }
        
        return false;

    }

    public boolean Transfer(BankAccount a2,double Money) {
        if (mbalance < 0) {
            return false;
        }
        if (mbalance < Money) {
            return false;
        }
        this.WithDraw(Money);
        a2.setMbalance(a2.getMbalance()+Money);
        return true;

    }
    public boolean CompareAccount(int acc)
    {
        return acc==this.mAccnum;
    }

}
