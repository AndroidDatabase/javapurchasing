/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author toringje_sd2022
 */
public class JTableRow {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JTable table = new JTable();

        Object[] columns = {"MedID", "Name", "Price", "Quantity", "BrandName", "GenericName", "Description"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);

        table.setBackground(Color.PINK);
        table.setForeground(Color.white);
        Font font = new Font("", 1, 22);
        table.setFont(font);
        table.setRowHeight(30);

        JTextField textMedId = new JTextField();
        JTextField textName = new JTextField();
        JTextField textPrice = new JTextField();
        JTextField textQuan = new JTextField();
        JTextField textBrand = new JTextField();
        JTextField textGene = new JTextField();
        JTextField textDes = new JTextField();

        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");
        JButton btnLogout = new JButton("Logout");

        textMedId.setBounds(20, 220, 100, 25);
        textName.setBounds(20, 250, 100, 25);
        textPrice.setBounds(20, 280, 100, 25);
        textQuan.setBounds(20, 310, 100, 25);
        textBrand.setBounds(20, 340, 100, 25);
        textGene.setBounds(20, 370, 100, 25);
        textDes.setBounds(20, 400, 100, 25);

        btnAdd.setBounds(150, 220, 100, 25);
        btnDelete.setBounds(150, 265, 100, 25);
        btnUpdate.setBounds(150, 310, 100, 25);
        btnLogout.setBounds(150, 355, 100, 25);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);

        frame.setLayout(null);

        frame.add(pane);

        frame.add(textMedId);
        frame.add(textName);
        frame.add(textPrice);
        frame.add(textQuan);
        frame.add(textBrand);
        frame.add(textGene);
        frame.add(textDes);

        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(btnLogout);

        Object[] row = new Object[7];
        btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                row[0] = textMedId.getText();
                row[1] = textName.getText();
                row[2] = textPrice.getText();
                row[3] = textQuan.getText();
                row[4] = textBrand.getText();
                row[5] = textGene.getText();
                row[6] = textDes.getText();

                model.addRow(row);
            }

        });

        btnDelete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int i = table.getSelectedRow();
                if (i >= 0) {
                    model.removeRow(i);
                } else {
                    System.out.println("Delete Error");
                }

            }

        });
        
        table.addMouseListener(new MouseAdapter() {

            public void mouseClicked(ActionEvent e) {

                int i = table.getSelectedRow();
                textMedId.setText(model.getValueAt(i, 0).toString());
                textName.setText(model.getValueAt(i, 1).toString());
                textPrice.setText(model.getValueAt(i, 2).toString());
                textQuan.setText(model.getValueAt(i, 3).toString());
                textBrand.setText(model.getValueAt(i, 4).toString());
                textGene.setText(model.getValueAt(i, 5).toString());
                textDes.setText(model.getValueAt(i, 6).toString());

            }

        });

        frame.setSize(
                1000, 500);
        frame.setLocationRelativeTo(
                null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(
                true);

    }

}
