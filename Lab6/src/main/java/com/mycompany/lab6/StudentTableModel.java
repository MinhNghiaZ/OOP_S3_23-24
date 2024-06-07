/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class StudentTableModel extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    public StudentTableModel() throws HeadlessException {
    }

    public StudentTableModel(GraphicsConfiguration gc) {
        super(gc);
    }

    public StudentTableModel(String title) throws HeadlessException {
        super(title);
    }
    
    public StudentTableModel(String title, GraphicsConfiguration gc) {
        super(title, gc);
        
        
        
    }

    
    
    
    
    
}
