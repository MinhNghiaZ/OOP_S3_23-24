/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Window;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class NewStudentDiaglog extends JDialog {
    private JTextField studentId,lastName,midName,firstName,yearOfBirth;
    private JRadioButton male,female;
    private JComboBox schoolStage;
    private JButton btnSave,btnClear,btnCancel;
    private Student newStudent;

    public NewStudentDiaglog(Student newStudent) {
        this.newStudent = newStudent;
    }

    public Student getNewStudent() {
        return newStudent;
    }

    public void setNewStudent(Student newStudent) {
        this.newStudent = newStudent;
    }
    

    public NewStudentDiaglog(Frame owner, String title) {
        super(owner, title);
        this.setSize(500, 500);
        this.setLocation(200,200);
      //  pack();
        this.setLayout(new GridLayout(5,1));
        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(new JLabel("Student Id"));
        
        studentId= new JTextField();
        studentId.setPreferredSize(new Dimension(200,40));
        panel1.add(studentId);
        this.add(panel1);
        
        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(new JLabel("Last-Mid-First Name"));
        lastName = new JTextField();
        lastName.setPreferredSize(new Dimension(60,40));
        midName = new JTextField();
        midName.setPreferredSize(new Dimension(60,40));
        firstName = new JTextField();
        firstName.setPreferredSize(new Dimension(60,40));
        panel2.add(lastName);
        panel2.add(midName);
        panel2.add(firstName);
        this.add(panel2);
        
        JPanel panel3 = new JPanel(new FlowLayout());
        panel3.add(new JLabel("Year of Birth"));
        yearOfBirth = new JTextField();
        yearOfBirth.setPreferredSize(new Dimension(50,30));
        panel3.add(yearOfBirth);
        male = new JRadioButton("Male");
        female = new JRadioButton("FeMale");
        ButtonGroup rndGroup = new ButtonGroup();
        rndGroup.add(male);
        rndGroup.add(female);
        panel3.add(male);
        panel3.add(female);
        this.add(panel3);
        String[] data ={"Elementary school","Middle School","High School"};
        schoolStage = new JComboBox(data);
        this.add(schoolStage);
        
        JPanel panel4 = new JPanel(new FlowLayout());
        btnSave = new JButton("Save");
        btnClear = new JButton("Clear");
        btnCancel = new JButton("Cancel");
        panel4.add(btnSave);
        btnSave.addActionListener((e)->{
            SaveStudent();
            setVisible(false);
        });
        panel4.add(btnClear);
        btnClear.addActionListener((e)->{
           studentId.setText("");
           lastName.setText("");
           midName.setText("");
           firstName.setText("");
           yearOfBirth.setText("");
        });
        panel4.add(btnCancel);
        btnCancel.addActionListener((e)->{
            setVisible(false);
        });
        this.add(panel4);
    }

    
    public NewStudentDiaglog() throws HeadlessException {
    }


    private void SaveStudent(){
        String id = studentId.getText();
        String last = lastName.getText();
        String mid = midName.getText();
        String first = firstName.getText();
        int yOb = Integer.parseInt(yearOfBirth.getText());
        String gender = male.isSelected()==true?"Male":"Female";
        String stage = schoolStage.getSelectedItem().toString();
        newStudent = new Student(id,last,mid,first,yOb,gender,stage);
    }
    
}
