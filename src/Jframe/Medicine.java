/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframe;

/**
 *
 * @author toringje_sd2022
 */
public class Medicine {
    
    private int medId;
    private String medname;
    private double price ;
    private int quantity;
    private String brandname;
    private String generic;
    private String description;

    public Medicine(int medId, String medname, double price, int quan, String brand, String gener, String desc) {
        this.medId = medId;
        this.medname = medname;
        this.price = price;
        this.quantity = quan;
        this.brandname = brand;
        this.generic = gener;
        this.description = desc;
    }

    public int getMedId() {
        return medId;
    }

    public String getMedname() {
        return medname;
    }

    public double getPrice() {
        return price;
    }

    public int getQuan() {
        return quantity;
    }

    public String getBrand() {
        return brandname;
    }

    public String getGener() {
        return generic;
    }

    public String getDesc() {
        return description;
    }
    
    
    
    
    
    
}
