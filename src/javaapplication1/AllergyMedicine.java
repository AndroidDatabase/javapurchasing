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
public class AllergyMedicine extends Medicine {

    public AllergyMedicine() {
    }

    public AllergyMedicine(int medId,String medicineName, double medPrice, int quantity, String medDesc) {
        super(medId, medicineName, medPrice, quantity, medDesc);
    }

    private ArrayList<Medicine> allergyMeds = new ArrayList<>();

    @Override
    public void displayMeds() {
        System.out.println("\nDISPLAY cough Medicines");
        Iterator itr = allergyMeds.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    @Override
    public void updateMed(Medicine medicine, int quantity) {
        for (int i =0; i < allergyMeds.size(); i++) {
            if(allergyMeds.get(i).getMedId() == medicine.getMedId()) {
                allergyMeds.get(i).setQuantity(allergyMeds.get(i).getQuantity()-quantity);
            }
        }
    }

    @Override
    public void populate() {
        allergyMeds.add(new AllergyMedicine(401, "Cetirizine Dihydrochloride", 20.25, 30,
                "BRAND NAME:Zyriz; GENERIC NAME:Cetirizine Dihydrochloride; USES:for allergies"));
        allergyMeds.add(new AllergyMedicine(402, "Loratadine", 23.75, 30,
                "BRAND NAME:Lorexa QD; GENERIC NAME:Loratadine; USES:for allergies"));
        allergyMeds.add(new AllergyMedicine(403, "Antihistamine", 22.15, 30,
                "BRAND NAME:Allerta; GENERIC NAME:Antihistamine; USES:for allergies"));
    }

    @Override
    public void displayMed(int Id) {
        System.out.println("\n-Medicine's Information-");
        for (int i =0; i < allergyMeds.size(); i++) {
            if(allergyMeds.get(i).getMedId() == Id) {
                System.out.println("Name: "+allergyMeds.get(i).getMedicineName());
                System.out.println("Description: "+allergyMeds.get(i).getMedDesc());
                System.out.println("Price: "+allergyMeds.get(i).getMedPrice());
            }
        }
    }

    @Override
    public double price(int id) {
        for (int i =0; i < allergyMeds.size(); i++) {
            if(allergyMeds.get(i).getMedId() == id) {
                return allergyMeds.get(i).getMedPrice();
            }
        }
        return 0;
    }

    
}
