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

    private int id;
    private String brandname;
    private int price;
    private int quantity;
    private String genericname;
    private String description;

    public Medicine(int id, String brandname, int price, int quantity, String genericname, String description) {
        this.id = id;
        this.brandname = brandname;
        this.price = price;
        this.quantity = quantity;
        this.genericname = genericname;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getGenericname() {
        return genericname;
    }

    public void setGenericname(String genericname) {
        this.genericname = genericname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

    

   

    

}
