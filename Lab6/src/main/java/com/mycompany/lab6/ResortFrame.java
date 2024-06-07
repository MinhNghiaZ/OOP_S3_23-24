/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class ResortFrame extends JFrame {
    private JTextField gueastName;
    private JCheckBox breakfast, golf, pool;
    private JComboBox day;
    private JButton btnCalculate;

    public ResortFrame() throws HeadlessException {
    }

    public ResortFrame(GraphicsConfiguration gc) {
        super(gc);
    }

    public ResortFrame(String title) throws HeadlessException {
        super(title);
        this.setSize(500,500);
        this.setLocation(200,200);
        this.setLayout(new GridLayout(7,1));
        
        JLabel text1 = new JLabel("Resort Price Calculator");
        text1.setFont(new Font("Serif", Font.PLAIN, 30));
        JLabel text2 = new JLabel("Base price for room is $200");
        text2.setFont(new Font("Serif", Font.PLAIN, 20));
        JLabel text3 = new JLabel("Choose option that you want");
        text3.setFont(new Font("Serif", Font.PLAIN, 20));
        JPanel panel1 = new JPanel(new FlowLayout());
        JPanel panel2 = new JPanel(new FlowLayout());
        JPanel panel3 = new JPanel(new FlowLayout());
        
        panel1.add(text1);
        panel2.add(text2);
        panel3.add(text3);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        
        JPanel panel4 = new JPanel(new FlowLayout());
        panel4.add(new JLabel("Guest name"));
        gueastName= new JTextField();
        gueastName.setPreferredSize(new Dimension(200,30));
        panel4.add(gueastName);
        this.add(panel4);
        
        JPanel panel5 = new JPanel(new FlowLayout());       
        breakfast = new JCheckBox("Breakfast $20");
        golf = new JCheckBox("Golf $50");
        pool = new JCheckBox("Pool $15");
        panel5.add(breakfast);
        panel5.add(golf);
        panel5.add(pool);
        this.add(panel5);
        
        JPanel panel6 = new JPanel(new FlowLayout());
        String[] data = {"Week day (-10%)","Weekend (+30%)"};
        day = new JComboBox(data);
        panel6.add(day);
        btnCalculate = new JButton("Calculate");
        panel6.add(btnCalculate);
        this.add(panel6);
        JPanel panel7 = new JPanel(new FlowLayout());
        JLabel text4 = new JLabel();
        panel7.add(text4);
        btnCalculate.addActionListener((e)->{
            if(gueastName.getText()!=null){
                double money=200;
            if(breakfast.isSelected()){
                money+=20;
            }
            if(golf.isSelected()){
                money+=50;
            }
            if(pool.isSelected()){
                money+=15;
            }
            if(day.getSelectedItem().equals("Week day (-10%)")){
                money-=money*10/100;
            }
            if(day.getSelectedItem().equals("Weekend (+30%)")){
                money+=money*30/100;
            }
            
            text4.setText(gueastName.getText()+" Your payment is: "+money);          
            }
            
    
            
            
        });
        this.add(panel7);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public ResortFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }
    
}
