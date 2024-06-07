/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author ASUS
 */
public class Lab8 {

    public static void main(String[] args) {
        CompanyInfo info = CompanyInfo.getInstance();
        
        info.displayInfo();
        
        info.setCompanyName("Hung88");
        info.setAddress("45D,New York");
        info.setPhoneNumber("0000000124242");
        
        info.displayInfo();
        
        Stock appleStock = new ConcreteStock("App", 100);
        Stock dellStock = new ConcreteStock("Dell", 100);
        
        Investor tomInvestor = new simpleInvestor("Tom");
        Investor BobInvestor = new simpleInvestor("Bob");
        appleStock.addObserver(tomInvestor);
        appleStock.addObserver(BobInvestor);
        dellStock.addObserver(BobInvestor);
        
        appleStock.notifyInvestors(100);
        appleStock.notifyInvestors(40.0);
        appleStock.notifyInvestors(10);
        appleStock.notifyInvestors(5.0);
        dellStock.notifyInvestors(300.0);
        dellStock.notifyInvestors(200.0);
    }
}
