/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author ASUS
 */
interface Investor {
    String getName();
    Strategy addaptStrategy();
    void update(String stockSymbol,double priceChange);
}
