/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author ASUS
 */
public class simpleInvestor implements Investor {
    private String name;
    private Strategy currentStrategy;

    public simpleInvestor(String name) {
        this.name = name;
        this.currentStrategy = Strategy.MonitorOnly;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Strategy addaptStrategy() {
        return currentStrategy;
    }

    @Override
    public void update(String stockSymbol, double priceChange) {
        System.out.println(getName()+"Was notified by the price change in"+stockSymbol+": $"+priceChange);
        if(priceChange<50){
            System.out.println(" and change their strategy to "+Strategy.HedgingStrategies);
        }
        else{
             if(priceChange>200){
                 System.out.println(" and change their strategy to "+Strategy.QuickTransactions);
             }
             else{
                 System.out.println("and decide to do nothing");
             }
        }
    }
    
}
