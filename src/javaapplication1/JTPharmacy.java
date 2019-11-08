/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import javax.swing.*;

/**
 *
 * @author toringje_sd2022
 */
public class JTPharmacy extends Login{
    
    public static void main(String args[]){
        JTPharmacy frameTabel = new JTPharmacy();
    }
    
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JLabel user = new JLabel("Username: ");
    JLabel password = new JLabel("Password: ");
    JTextField userName_text = new JTextField(15);
    JPasswordField password_text = new JPasswordField(15);
    JButton submit = new JButton("Submit");
    
    

    JTPharmacy() {
        setTitle("Login Form");
        label.setBounds(80,110,200,30);
        user.setBounds(10, 30, 100, 30);
        password.setBounds(10,65,100,30);
        setSize(400, 350);
        setLocation(500,280);
        panel.setLayout(null);
        
        userName_text.setBounds(50,30,150,50);
        submit.setBounds(110,100,80,30);
        
        panel.add(label);
        panel.add(submit);
        panel.add(user);
        panel.add(userName_text);
        
        getContentPane().add(panel);
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        setVisible(true);

    }

    

}
