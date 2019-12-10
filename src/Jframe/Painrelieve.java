/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author 2ndyrGroupB
 */
public class Painrelieve extends javax.swing.JFrame {

    /**
     * Creates new form NextPage
     */
    public Painrelieve() {
        initComponents();     Show_Medicine_In_JTable();
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

    public void Show_Medicine_In_JTable() {

        ArrayList<Medicine> list;
        DefaultTableModel model;
        Object[] row;

        list = getMedicinesListCough();
        model = (DefaultTableModel) cough_table3.getModel();
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
    public void executeSQLQuery(String query, String message) {
        Connection con = getConnection();
        Statement st;
        try {
            st = con.createStatement();
            if (st.executeUpdate(query) == 1) {

                //Refresh medtable data
                DefaultTableModel model = (DefaultTableModel) cough_table3.getModel();
                model.setRowCount(0);
                Show_Medicine_In_JTable();
                
                JOptionPane.showMessageDialog(null, message);
            } else {
                JOptionPane.showMessageDialog(null, "Data not changed!");

            }
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Quantity is required!");

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

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        coughlabel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        backbtn3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        medicine_id3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        price3 = new javax.swing.JTextField();
        quantity3 = new javax.swing.JTextField();
        brand_name3 = new javax.swing.JTextField();
        cancel_button3 = new javax.swing.JButton();
        buy_button3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cough_table3 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        coughlabel.setBackground(new java.awt.Color(0, 51, 102));
        coughlabel.setPreferredSize(new java.awt.Dimension(719, 512));

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("                                                   MORRE PHARMACY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                .addGap(204, 204, 204))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        backbtn3.setBackground(new java.awt.Color(204, 0, 0));
        backbtn3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backbtn3.setForeground(new java.awt.Color(255, 255, 255));
        backbtn3.setText("<< BACK");
        backbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("BRAND NAME");

        medicine_id3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicine_id3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("PRICE");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("QUANTITY");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("MEDICINE ID");

        price3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price3ActionPerformed(evt);
            }
        });

        quantity3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity3ActionPerformed(evt);
            }
        });

        brand_name3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand_name3ActionPerformed(evt);
            }
        });

        cancel_button3.setBackground(new java.awt.Color(204, 0, 0));
        cancel_button3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancel_button3.setForeground(new java.awt.Color(255, 255, 255));
        cancel_button3.setText("Clear");
        cancel_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_button3ActionPerformed(evt);
            }
        });

        buy_button3.setBackground(new java.awt.Color(0, 102, 255));
        buy_button3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buy_button3.setForeground(new java.awt.Color(255, 255, 255));
        buy_button3.setText("Buy");
        buy_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(cancel_button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(price3)
                        .addComponent(medicine_id3)
                        .addComponent(quantity3, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addComponent(brand_name3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(buy_button3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicine_id3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buy_button3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PAINRELIEVER MEDICINE");

        jScrollPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cough_table3.setBackground(new java.awt.Color(153, 153, 255));
        cough_table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE ID", " BRAND NAME", "PRICE", "QUANTITY", "GENERIC NAME", "DESCRIPTION"
            }
        ));
        cough_table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cough_table3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(cough_table3);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Select the medicine you want to buy.");

        javax.swing.GroupLayout coughlabelLayout = new javax.swing.GroupLayout(coughlabel);
        coughlabel.setLayout(coughlabelLayout);
        coughlabelLayout.setHorizontalGroup(
            coughlabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(coughlabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(coughlabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(coughlabelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(coughlabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(coughlabelLayout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(coughlabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(coughlabelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coughlabelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addGap(220, 220, 220))))
                        .addGroup(coughlabelLayout.createSequentialGroup()
                            .addGap(350, 350, 350)
                            .addComponent(jLabel4)
                            .addGap(475, 475, 475)))
                    .addContainerGap()))
        );
        coughlabelLayout.setVerticalGroup(
            coughlabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coughlabelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backbtn3)
                .addContainerGap(424, Short.MAX_VALUE))
            .addGroup(coughlabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(coughlabelLayout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(coughlabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(coughlabelLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(38, 38, 38)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coughlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coughlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn3ActionPerformed
        // TODO add your handling code here:
        Customer med = new Customer();
        med.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backbtn3ActionPerformed

    private void medicine_id3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicine_id3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicine_id3ActionPerformed

    private void price3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price3ActionPerformed

    private void quantity3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantity3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantity3ActionPerformed

    private void brand_name3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand_name3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand_name3ActionPerformed

    private void cancel_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_button3ActionPerformed

        TableModel model = cough_table3.getModel();
        medicine_id3.setText("");
        brand_name3.setText("");
        price3.setText("");
        quantity3.setText("");
    }//GEN-LAST:event_cancel_button3ActionPerformed

    private void buy_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_button3ActionPerformed
        int i = cough_table3.getSelectedRow();
        TableModel model = cough_table3.getModel();
        int total = Integer.parseInt(quantity3.getText()) * Integer.parseInt(price3.getText());
        int newquantity = Integer.parseInt(model.getValueAt(i, 3).toString()) - Integer.parseInt(quantity3.getText());
        String query1 = "UPDATE `painrelievermeds` SET `quantity` = '" + newquantity + "' WHERE `id` = '" + medicine_id3.getText() + "'";
        executeSQLQuery(query1, "Painreliever medicines updated!");
        String query = "INSERT INTO `buy`(`medicine_id`, `brand_name`, `price`,`quantity`, `total`)VALUES ('" + medicine_id3.getText() + "','" + brand_name3.getText() + "','" + price3.getText() + "','" + quantity3.getText() + "','" + total+ "')";
        executeSQLQuery(query, "Medicine added to your recepit!");
    }//GEN-LAST:event_buy_button3ActionPerformed

    private void cough_table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cough_table3MouseClicked

        //Display Selected Row
        int i = cough_table3.getSelectedRow();
        TableModel model = cough_table3.getModel();
        medicine_id3.setText(model.getValueAt(i, 0).toString());
        brand_name3.setText(model.getValueAt(i, 1).toString());
        price3.setText(model.getValueAt(i, 2).toString());
        quantity3.setText("");
    }//GEN-LAST:event_cough_table3MouseClicked

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
            java.util.logging.Logger.getLogger(Painrelieve.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Painrelieve.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Painrelieve.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Painrelieve.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Painrelieve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn3;
    private javax.swing.JTextField brand_name3;
    private javax.swing.JButton buy_button3;
    private javax.swing.JButton cancel_button3;
    private javax.swing.JTable cough_table3;
    private javax.swing.JPanel coughlabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField medicine_id3;
    private javax.swing.JTextField price3;
    private javax.swing.JTextField quantity3;
    // End of variables declaration//GEN-END:variables
}
