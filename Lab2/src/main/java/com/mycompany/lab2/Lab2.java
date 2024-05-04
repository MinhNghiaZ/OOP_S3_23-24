/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Lab2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Complex c1 = new Complex();
//        c1.InputComplex();
//        Complex c2 = new Complex();
//        c2.InputComplex();
//        c1.OutputComplex();
//        c2.OutputComplex();
//        c1.PlusComplex(c2).OutputComplex();
//        c1.MinusComplex(c2).OutputComplex();
//        c1.MultiComplex(c2).OutputComplex();
//        c1.DivideComplex(c2).OutputComplex();
        Bank bank = new Bank();
        bank.Input();
        bank.Output();
        bank.DepositAccount();
        bank.WithDrawAccount();
        bank.TransferMoney();
        bank.Output();

    }
}
