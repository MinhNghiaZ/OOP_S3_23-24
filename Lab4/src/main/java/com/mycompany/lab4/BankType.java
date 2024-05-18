/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author Student
 */
public class BankType {
    private String TPB;
    private String VTB;

    public BankType() {
    }

    public String getTPB() {
        return TPB;
    }

    public String getVTB() {
        return VTB;
    }

    public BankType(String TPB, String VTB) {
        this.TPB = TPB;
        this.VTB = VTB;
    }

    public void setTPB(String TPB) {
        this.TPB = TPB;
    }

    public void setVTB(String VTB) {
        this.VTB = VTB;
    }

    
    public void InputTPBank(){
        TPB = "TPBank";
    }
    public void InputVTBank(){
        VTB = "VTBank";
    }
    
}
