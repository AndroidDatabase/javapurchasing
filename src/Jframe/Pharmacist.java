/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframe;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 2ndyrGroupB
 */
public class Pharmacist extends javax.swing.JFrame {

    /**
     * Creates new form NextPage
     */
    public Pharmacist() {
        initComponents();
        Show_Medicine_In_JTable();
    }
    public Connection getConnection() {

        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jessmelphar", "root", "");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Medicine> getMedicinesListCough() {
        ArrayList<Medicine> medicinesList = new ArrayList<Medicine>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `coughmeds`";
        Statement st;
        ResultSet rs;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Medicine medicine;
            while (rs.next()) {
                medicine = new Medicine(rs.getInt("id"), rs.getString("brandname"), rs.getInt("price"), rs.getInt("quantity"), rs.getString("genericname"), rs.getString("description"));
                medicinesList.add(medicine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return medicinesList;
    }

    public ArrayList<Medicine> getMedicinesListHeadache() {
        ArrayList<Medicine> medicinesList = new ArrayList<Medicine>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `headachemeds`";
        Statement st;
        ResultSet rs;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Medicine medicine;
            while (rs.next()) {
                medicine = new Medicine(rs.getInt("id"), rs.getString("brandname"), rs.getInt("price"), rs.getInt("quantity"), rs.getString("genericname"), rs.getString("description"));
                medicinesList.add(medicine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return medicinesList;
    }

    public ArrayList<Medicine> getMedicinesListPainreliever() {
        ArrayList<Medicine> medicinesList = new ArrayList<Medicine>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `painrelievermeds`";
        Statement st;
        ResultSet rs;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Medicine medicine;
            while (rs.next()) {
                medicine = new Medicine(rs.getInt("id"), rs.getString("brandname"), rs.getInt("price"), rs.getInt("quantity"), rs.getString("genericname"), rs.getString("description"));
                medicinesList.add(medicine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return medicinesList;
    }

    public ArrayList<Medicine> getMedicinesListAllergy() {
        ArrayList<Medicine> medicinesList = new ArrayList<Medicine>();
        Connection connection = getConnection();
        String query = "SELECT * FROM `allergymeds`";
        Statement st;
        ResultSet rs;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Medicine medicine;
            while (rs.next()) {
                medicine = new Medicine(rs.getInt("id"), rs.getString("brandname"), rs.getInt("price"), rs.getInt("quantity"), rs.getString("genericname"), rs.getString("description"));
                medicinesList.add(medicine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return medicinesList;
    }

    public void Show_Medicine_In_JTable() {

        ArrayList<Medicine> list;
        DefaultTableModel model;
        Object[] row;
        
        list = getMedicinesListCough();
        model = (DefaultTableModel) cough_table.getModel();
        row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getBrandname();
            row[2] = list.get(i).getPrice();
            row[3] = list.get(i).getQuantity();
            row[4] = list.get(i).getGenericname();
            row[5] = list.get(i).getDescription();
            model.addRow(row);
        }
        list = getMedicinesListAllergy();
        model = (DefaultTableModel) allergy_table.getModel();
        row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getBrandname();
            row[2] = list.get(i).getPrice();
            row[3] = list.get(i).getQuantity();
            row[4] = list.get(i).getGenericname();
            row[5] = list.get(i).getDescription();
            model.addRow(row);
        }
        list = getMedicinesListPainreliever();
        model = (DefaultTableModel) painreliever_table.getModel();
        row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getBrandname();
            row[2] = list.get(i).getPrice();
            row[3] = list.get(i).getQuantity();
            row[4] = list.get(i).getGenericname();
            row[5] = list.get(i).getDescription();
            model.addRow(row);
        }
        list = getMedicinesListHeadache();
        model = (DefaultTableModel) headache_table.getModel();
        row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getBrandname();
            row[2] = list.get(i).getPrice();
            row[3] = list.get(i).getQuantity();
            row[4] = list.get(i).getGenericname();
            row[5] = list.get(i).getDescription();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        viewallbutton = new javax.swing.JButton();
        coughbutton = new javax.swing.JButton();
        headbutton = new javax.swing.JButton();
        painbutton = new javax.swing.JButton();
        allergybutton = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        painreliever_table = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        cough_table = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        headache_table = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        allergy_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("                                                                   JESSMEL PHARMACY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("COUGH MEDICINES");

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        viewallbutton.setBackground(new java.awt.Color(255, 204, 204));
        viewallbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewallbutton.setText("VIEW ALL MEDICINES");
        viewallbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewallbuttonMouseClicked(evt);
            }
        });
        viewallbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallbuttonActionPerformed(evt);
            }
        });

        coughbutton.setBackground(new java.awt.Color(255, 204, 204));
        coughbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coughbutton.setText("COUGH MEDICINE");
        coughbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coughbuttonMouseClicked(evt);
            }
        });
        coughbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coughbuttonActionPerformed(evt);
            }
        });

        headbutton.setBackground(new java.awt.Color(255, 204, 204));
        headbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        headbutton.setText("HEADACHE MEDICINE");
        headbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headbuttonActionPerformed(evt);
            }
        });

        painbutton.setBackground(new java.awt.Color(255, 204, 204));
        painbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        painbutton.setText("PAINRELIEVER MEDICINE");
        painbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painbuttonActionPerformed(evt);
            }
        });

        allergybutton.setBackground(new java.awt.Color(255, 204, 204));
        allergybutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        allergybutton.setText("ALLERGY MEDICINE");
        allergybutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allergybuttonMouseClicked(evt);
            }
        });
        allergybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allergybuttonActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 204, 204));
        logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logout.setText("LOGOUT");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coughbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(allergybutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewallbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(viewallbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(coughbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(headbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(allergybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HEADACHE MEDICINES");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("   ALLERGY MEDICINES");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("   PAIN RELEIVER MEDICINES");

        jScrollPane5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        painreliever_table.setBackground(new java.awt.Color(153, 153, 255));
        painreliever_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE ID", " BRAND NAME", "PRICE", "QUANTITY", "GENERIC NAME", "DESCRIPTION"
            }
        ));
        painreliever_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painreliever_tableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(painreliever_table);

        jScrollPane6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cough_table.setBackground(new java.awt.Color(153, 153, 255));
        cough_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE ID", " BRAND NAME", "PRICE", "QUANTITY", "GENERIC NAME", "DESCRIPTION"
            }
        ));
        cough_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cough_tableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(cough_table);

        jScrollPane7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        headache_table.setBackground(new java.awt.Color(153, 153, 255));
        headache_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE ID", " BRAND NAME", "PRICE", "QUANTITY", "GENERIC NAME", "DESCRIPTION"
            }
        ));
        headache_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headache_tableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(headache_table);

        jScrollPane8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        allergy_table.setBackground(new java.awt.Color(153, 153, 255));
        allergy_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE ID", " BRAND NAME", "PRICE", "QUANTITY", "GENERIC NAME", "DESCRIPTION"
            }
        ));
        allergy_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allergy_tableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(allergy_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(329, 329, 329)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(315, 315, 315)
                                        .addComponent(jLabel4)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel6)
                        .addContainerGap(299, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(319, 319, 319))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewallbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewallbuttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewallbuttonMouseClicked

    private void viewallbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallbuttonActionPerformed
        Pharmacist p = new Pharmacist();
        p.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_viewallbuttonActionPerformed

    private void coughbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coughbuttonMouseClicked
//        AddMedCough cough = new AddMedCough();
//        cough.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_coughbuttonMouseClicked

    private void coughbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coughbuttonActionPerformed
        // TODO add your handling code here:
        AddMedCough cough = new AddMedCough();
        cough.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_coughbuttonActionPerformed

    private void headbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headbuttonActionPerformed
        // TODO add your handling code here:
        AddHead headache = new AddHead();
        headache.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_headbuttonActionPerformed

    private void allergybuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allergybuttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_allergybuttonMouseClicked

    private void allergybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allergybuttonActionPerformed
        // TODO add your handling code here:
        AddAller allergy = new AddAller();
        allergy.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_allergybuttonActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Login a = new Login();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void painbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painbuttonActionPerformed
        AddMedPain pain = new AddMedPain();
        pain.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_painbuttonActionPerformed

    private void painreliever_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painreliever_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_painreliever_tableMouseClicked

    private void cough_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cough_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cough_tableMouseClicked

    private void headache_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headache_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_headache_tableMouseClicked

    private void allergy_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allergy_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_allergy_tableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pharmacist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allergy_table;
    private javax.swing.JButton allergybutton;
    private javax.swing.JTable cough_table;
    private javax.swing.JButton coughbutton;
    private javax.swing.JTable headache_table;
    private javax.swing.JButton headbutton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JButton logout;
    private javax.swing.JButton painbutton;
    private javax.swing.JTable painreliever_table;
    private javax.swing.JButton viewallbutton;
    // End of variables declaration//GEN-END:variables
}
