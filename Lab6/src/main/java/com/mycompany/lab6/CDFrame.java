/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class CDFrame extends JFrame {
    private JTextField cdId, cdTitle,cdPrice,cdYear;
    private JComboBox collectionCD;
    private JRadioButton cd,vcd;
    private JButton btnadd,btnclear,btnshow;

    public CDFrame() throws HeadlessException {
    }

    public CDFrame(GraphicsConfiguration gc) {
        super(gc);
    }

    public CDFrame(String title) throws HeadlessException {
        super(title);
        
        this.setSize(500,300);
        this.setLocation(200,200);
        this.setLayout(new GridLayout(7,1));
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        cdId = new JTextField();
        cdId.setPreferredSize(new Dimension(200,30));
        panel1.add(new JLabel("CD ID "));
        panel1.add(cdId);
        this.add(panel1);
        
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        cdTitle = new JTextField();
        cdTitle.setPreferredSize(new Dimension(200,30));
        panel2.add(new JLabel("CD title "));
        panel2.add(cdTitle);
        this.add(panel2);
        
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        String[] data = {"game","movie","music"};
        collectionCD = new JComboBox(data);
        panel3.add(new JLabel("CD Collection "));
        panel3.add(collectionCD);
        panel3.add(new JLabel("CD Type "));
        cd = new JRadioButton("CD");
        vcd = new JRadioButton("VCD");
        ButtonGroup rndGroup = new ButtonGroup();
        rndGroup.add(cd);
        rndGroup.add(vcd);
        panel3.add(vcd);
        panel3.add(cd);
        this.add(panel3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel4 = new JPanel();
        panel4.setLayout(new FlowLayout());
        cdPrice = new JTextField();
        cdPrice.setPreferredSize(new Dimension(200,30));
        panel4.add(new JLabel("CD Price "));
        panel4.add(cdPrice);
        this.add(panel4);
        
        JPanel panel5 = new JPanel();
        panel4.setLayout(new FlowLayout());
        panel5.add(new JLabel("Year of release"));
        this.add(panel5);
        
        JPanel panel6 = new JPanel();
        panel6.setLayout(new FlowLayout());
        cdYear = new JTextField();
        cdYear.setPreferredSize(new Dimension(200,30));
        panel6.add(cdYear);
        btnadd = new JButton("Add");
        panel6.add(btnadd);
        btnadd.addActionListener((e)->{
            String CDid = cdId.getText();
            String CDtitle = cdTitle.getText();
            String CDCollection = collectionCD.getSelectedItem().toString();
            String CDtype = vcd.isSelected()==true?"VCD":"CD";
            int price = Integer.parseInt(cdPrice.getText());
            int year = Integer.parseInt(cdYear.getText());
            CD newCd = new CD(CDid,CDCollection,CDtype,CDtitle,price,year);
            newCd.addCD(newCd);
            JOptionPane.showMessageDialog(null, "Success", "Message", JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
        });
        
        this.add(panel6);
        
        JPanel panel7 = new JPanel();
        panel7.setLayout(new FlowLayout());
        btnclear = new JButton("Clear");
        btnshow = new JButton("Show All");
        panel7.add(btnclear);
        btnclear.addActionListener((e)->{
            cdId.setText("");
            cdTitle.setText("");
            cdPrice.setText("");
            cdYear.setText("");
        });
        panel7.add(btnshow);
        this.add(panel7);
        
    }

    public CDFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }
    
}
