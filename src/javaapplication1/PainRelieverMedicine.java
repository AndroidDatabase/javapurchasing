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
public class PainRelieverMedicine extends Medicine {

    public PainRelieverMedicine() {
    }

    public PainRelieverMedicine(int medId,String medicineName, double medPrice, int quantity, String medDesc) {
        super(medId, medicineName, medPrice, quantity, medDesc);
    }

    private ArrayList<Medicine> painRelieverMeds = new ArrayList<>();

    @Override
    public void displayMeds() {
        System.out.println("\nDISPLAY cough Medicines");
        Iterator itr = painRelieverMeds.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    @Override
    public void updateMed(Medicine medicine, int quantity) {
        for (int i =0; i < painRelieverMeds.size(); i++) {
            if(painRelieverMeds.get(i).getMedId() == medicine.getMedId()) {
                painRelieverMeds.get(i).setQuantity(painRelieverMeds.get(i).getQuantity()-quantity);
                System.out.println(painRelieverMeds.get(i).getQuantity());
            }
        }
    }

    @Override
    public void populate() {
        painRelieverMeds.add(new PainRelieverMedicine(301, "Ibuprofen + Paracetamol", 6, 30,
                "BRAND NAME:Alaxan; GENERIC NAME:Ibuprofen + Paracetamol; USES:for pain reliever"));
        painRelieverMeds.add(new PainRelieverMedicine(302, "Mefenamic Acid", 6, 30,
                "BRAND NAME:Dolfenal; GENERIC NAME:Mefenamic Acid; USES:for pain reliever"));
        painRelieverMeds.add(new PainRelieverMedicine(303, "Ibuprofen", 6, 30,
                "BRAND NAME:Medicol Advance; GENERIC NAME:Ibuprofen; USES:for pain reliever"));
    }

    @Override
    public void displayMed(int Id) {
        for (int i =0; i < painRelieverMeds.size(); i++) {
        System.out.println("\n-Medicine's Information-");
            if(painRelieverMeds.get(i).getMedId() == Id) {
                System.out.println("Name: "+painRelieverMeds.get(i).getMedicineName());
                System.out.println("Description: "+painRelieverMeds.get(i).getMedDesc());
                System.out.println("Price: "+painRelieverMeds.get(i).getMedPrice());
            }
        }
    }

    @Override
    public double price(int id) {
        for (int i =0; i < painRelieverMeds.size(); i++) {
            if(painRelieverMeds.get(i).getMedId() == id) {
                return painRelieverMeds.get(i).getMedPrice();
            }
        }
        return 0;
    }

    
}
