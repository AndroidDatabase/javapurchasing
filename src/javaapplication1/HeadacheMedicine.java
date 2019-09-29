/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 2ndyrGroupB
 */
public class HeadacheMedicine extends Medicine {

    public HeadacheMedicine() {
    }

    public HeadacheMedicine(int medId,String medicineName, double medPrice, int quantity, String medDesc) {
        super(medId, medicineName, medPrice, quantity, medDesc);
    }

    private ArrayList<Medicine> headacheMeds = new ArrayList<>();

    @Override
    public void displayMeds() {
        System.out.println("\nDISPLAY Headache Medicines");
        Iterator itr = headacheMeds.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    @Override
    public void updateMed(Medicine medicine, int quantity) {
        for (int i =0; i < headacheMeds.size(); i++) {
            if(headacheMeds.get(i).getMedId() == medicine.getMedId()) {
                headacheMeds.get(i).setQuantity(headacheMeds.get(i).getQuantity()-quantity);
            }
        }
    }

    @Override
    public void populate() {
        headacheMeds.add(new HeadacheMedicine(201, "Phenylephrine HCI Ibuprofen", 6, 30,
                "BRAND NAME:Bioflu Non-Drowsy; GENERIC NAME:Phenylephrine HCI Ibuprofen; USES:for fever reduction"));
        headacheMeds.add(new HeadacheMedicine(202, "Paracetamol Caffeine", 6, 30,
                "BRAND NAME:Rexidol Forte; GENERIC NAME:Paracetamol Caffeine; USES:for fever reduction"));
        headacheMeds.add(new HeadacheMedicine(203, "Paracetamol", 6, 30,
                "BRAND NAME:Biogesic; GENERIC NAME:Paracetamol; USES:for fever reduction"));
    }

    @Override
    public void displayMed(int Id) {
        System.out.println("\n-Medicine's Information-");
        for (int i =0; i < headacheMeds.size(); i++) {
            if(headacheMeds.get(i).getMedId() == Id) {
                System.out.println("Name: "+headacheMeds.get(i).getMedicineName());
                System.out.println("Description: "+headacheMeds.get(i).getMedDesc());
                System.out.println("Price: "+headacheMeds.get(i).getMedPrice());
            }
        }
    }

    @Override
    public double price(int id) {
        for (int i =0; i < headacheMeds.size(); i++) {
            if(headacheMeds.get(i).getMedId() == id) {
                return headacheMeds.get(i).getMedPrice();
            }
        }
        return 0;
    }

    
    
}
