/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class MainFrame extends JFrame {

    private JButton btnchecktotalStudent, btnewStudent, btnRefresh;

    public MainFrame() throws HeadlessException {
    }

    public MainFrame(GraphicsConfiguration gc) {
        super(gc);
    }
    StudentManager s = new StudentManager();
    

    public MainFrame(String title) throws HeadlessException {
        super(title);
        btnchecktotalStudent = new JButton("Check total student");
        btnchecktotalStudent.addActionListener((e) -> {
            JOptionPane.showMessageDialog(null, "there are:" + s.getListStudent().size(), "Message", JOptionPane.INFORMATION_MESSAGE);
        });
        btnewStudent = new JButton("New Student");
        btnewStudent.addActionListener((e) -> {
            NewStudentDiaglog dlg = new NewStudentDiaglog(this, "new Student");
            dlg.setModal(true);
            dlg.setVisible(true);
            if (s.addStudent(dlg.getNewStudent()) == true) {
                JOptionPane.showMessageDialog(null, "Success", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Fail", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
           

        });
        btnRefresh = new JButton("Refresh");
        this.setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(btnchecktotalStudent);
        panel1.add(btnewStudent);
        panel1.add(btnRefresh);
        this.add(panel1, BorderLayout.NORTH);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Student ID");
        model.addColumn("First name");
        model.addColumn("Last Name");
        model.addColumn("Gender");
        model.addColumn("school stage");
        JTable table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(400, 300));
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(400, 300));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel2.add(scrollPane);
        btnRefresh.addActionListener((e) -> {
            s.ReadFile();
            model.setRowCount(0);
            for (var s : s.getListStudent()) {
                model.addRow(new Object[]{s.getStudentId(), s.getFirstName(), s.getLastName(), s.getGender(), s.getSchoolStage()});
            }
        });
        table.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    int selectedRow = table.getSelectedRow();
                    String studentID = (String) table.getValueAt(selectedRow, 0);
                    s.Remove(studentID);
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        this.add(panel2, BorderLayout.CENTER);
        this.setSize(800, 600);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public MainFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }

}
