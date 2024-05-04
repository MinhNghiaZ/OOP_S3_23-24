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
public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex() {
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }
    
    public void InputComplex()
    {
        Scanner sc = new Scanner(System.in);
        re = sc.nextDouble();
        im = sc.nextDouble();
        
    }
    public void OutputComplex()
    {
        System.out.println(re+"+ i"+im);
    }
    public Complex PlusComplex(Complex c2)
    {
        Complex result = new Complex();
        result.setRe(this.re+c2.getRe());
        result.setIm(this.im+c2.getIm());
        return result;
    }
    public Complex MinusComplex(Complex c2)
    {
        Complex result = new Complex();
        result.setRe(this.re-c2.getRe());
        result.setIm(this.im-c2.getIm());
        return result;
    }
    public Complex MultiComplex(Complex c2)
    {
        Complex result = new Complex();
        result.setRe(this.re*c2.getRe());
        result.setIm(this.im*c2.getIm());
        return result;
    }
    public Complex DivideComplex(Complex c2)
    {
        Complex result = new Complex();
        result.setRe(this.re/c2.getRe());
        result.setIm(this.im/c2.getIm());
        return result;
    }
    
    
    
    
}
