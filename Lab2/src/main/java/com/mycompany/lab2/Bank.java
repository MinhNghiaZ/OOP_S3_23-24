/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Bank {

    ArrayList<BankAccount> BankList = new ArrayList<>();

    public Bank() {
    }
    Scanner sc = new Scanner(System.in);

    public void Input() {
        System.out.println("input N account: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BankAccount account = new BankAccount();
            account.Input();
            BankList.add(account);
        }
    }

    public void Output() {
        for (int i = 0; i < BankList.size(); i++) {
            BankList.get(i).print();
            System.out.println();
        }

    }

    public void DepositAccount() {

        System.out.println("Input account Number: ");
        int accNumber = sc.nextInt();
        System.out.println("Input Money: ");
        Double money = sc.nextDouble();
        int k = 0;
        boolean flag = false;
        for (int i = 0; i < BankList.size(); i++) {
            if (BankList.get(i).CompareAccount(accNumber)) {
                flag = true;
                k = i;
            }

        }
        if (flag) {
            BankList.get(k).Deposit(money);
        } else {
            System.out.println("can not found account");
        }

    }

    public void WithDrawAccount() {

        System.out.println("Input account Number: ");
        int accNumber = sc.nextInt();
        System.out.println("Input Money: ");
        Double money = sc.nextDouble();
        int k = 0;
        boolean flag = false;
        for (int i = 0; i < BankList.size(); i++) {
            if (BankList.get(i).CompareAccount(accNumber)) {
                flag = true;
                k = i;
            }

        }
        if (flag) {
            BankList.get(k).WithDraw(money);
        } else {
            System.out.println("can not found account");
        }

    }

    public void TransferMoney() {

        System.out.println("Input account Number: ");
        int accNumber = sc.nextInt();
        System.out.println("Account to transfer");
        int accNumber2 = sc.nextInt();
        System.out.println("Input Money: ");
        Double money = sc.nextDouble();
        int k = 0;
        int k1 = 0;
        boolean flag = false;
        boolean flag1 = false;
        for (int i = 0; i < BankList.size(); i++) {
            if (BankList.get(i).CompareAccount(accNumber)) {
                flag = true;
                k = i;
            }
            if (BankList.get(i).CompareAccount(accNumber2)) {
                flag1 = true;
                k1 = i;
            }

        }
        if (flag && flag1) {
            BankList.get(k).Transfer(BankList.get(k1), money);
        } else {
            System.out.println("can not found account");
        }

    }
}
