/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author toringje_sd2022
 */
public class Senior  extends User {

    public Senior(String name, int age) {
        super(name, age);
    }

    @Override
    public double totalAmountPaid() {
        super.setTotalAmount(super.getTotalAmount()*0.2);
        return super.getTotalAmount();
    }
}
    
    

