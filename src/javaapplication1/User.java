/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author toringje_sd2022
 */
public abstract class User {

    private String name;
    private int age;
    private List<Medicine> purchase = new ArrayList();
    private double totalAmount = 0;

    public User() {

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Medicine> getPurchase() {
        return purchase;
    }

    public void setPurchase(List<Medicine> purchase) {
       
        this.purchase = purchase;
    }

    public void addpurchaseMed(Medicine medicine) {
        purchase.add(medicine);

    }
    
    public abstract double totalAmountPaid();

//    public void searhMed() {
//        System.out.println("----------------Medicine Category-----------------\n");
//        System.out.println("A.Cough\nB.Headache\nC.Bodypain\nD.Allergy");
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter letter: ");
//        String med = input.nextLine();
//        if ("A".equals(med)) {
//            System.out.println("Decolgen Forte, Neozep Forte, Solmux");
//        }
//        else if("B".equals(med)){
//            System.out.println("Bioflu, Biogesic, Rexidol Forte");
//        }
//
//    }

}
