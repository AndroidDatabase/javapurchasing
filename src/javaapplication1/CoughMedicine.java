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
public class CoughMedicine extends Medicine {

    public CoughMedicine() {
    }

    public CoughMedicine(int medId,String medicineName, double medPrice, int quantity, String medDesc) {
        super(medId, medicineName, medPrice, quantity, medDesc);
    }
    
    private ArrayList<Medicine> coughmedicines = new ArrayList<>();

    @Override
    public void displayMeds() {
        System.out.println("\nDISPLAY cough Medicines");
        Iterator itr = coughmedicines.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    @Override
    public void updateMed(Medicine medicine, int quantity) {
        for (int i =0; i < coughmedicines.size(); i++) {
            if(coughmedicines.get(i).getMedId() == medicine.getMedId()) {
                coughmedicines.get(i).setQuantity(coughmedicines.get(i).getQuantity()-quantity);
            }
        }
    }

    @Override
    public void populate() {
        coughmedicines.add(new CoughMedicine(101, "Carbocisteine + Zinc", 42.50, 30,
                "BRAND NAME:Solmux Advance; GENERIC NAME:Carbocisteine + Zinc; USES:for cough"));
        coughmedicines.add(new CoughMedicine(102, "Ambroxol HCI", 32.75, 30,
                "BRAND NAME:Expel OD; GENERIC NAME:Ambroxol HCI; USES:for cough"));
        coughmedicines.add(new CoughMedicine(103, "Dextromethorphan HBr Phenylpropanolamine HCI Paracetamol", 9.75, 30,
                "BRAND NAME:Tuseran Forte; GENERIC NAME:Dextromethorphan HBr Phenylpropanolamine HCI Paracetamol; USES:for cough"));
    }

    @Override
    public void displayMed(int Id) {
        System.out.println("\n-Medicine's Information-");
        for (int i =0; i < coughmedicines.size(); i++) {
            if(coughmedicines.get(i).getMedId() == Id) {
                System.out.println("Name: "+coughmedicines.get(i).getMedicineName());
                System.out.println("Description: "+coughmedicines.get(i).getMedDesc());
                System.out.println("Price: "+coughmedicines.get(i).getMedPrice());
            }
        }
    }

    @Override
    public double price(int id) {
        for (int i =0; i < coughmedicines.size(); i++) {
            if(coughmedicines.get(i).getMedId() == id) {
                return coughmedicines.get(i).getMedPrice();
            }
        }
        return 0;
    }
    
}
