/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupC
 */
public class ListOfAllergyMed {

    ArrayList<AllergyMedicine> allergyMeds;
    ListOfReceipts receipt = new ListOfReceipts();

    public ListOfAllergyMed() {
        allergyMeds = new ArrayList<>();
        populate();
    }

    public void displayMeds() {
        System.out.println("\n\t\t*** M E D I C I N E S  F O R  A L L E R G Y  ***\n");
        System.out.println("ID\t|MEDICINE\t\t\t|PRICE\t\t|QUANTITY\t\t|DESCRIPTION\n");
        Iterator itr = allergyMeds.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.print("\nPlease enter medicine id : ");
    }

    public boolean updateMed(int ID, int quantity) {
        for (AllergyMedicine a : allergyMeds) {
            if (a.getMedId() == ID) {
                if (a.getQuantity() >= quantity) {
                    a.setQuantity(a.getQuantity() - quantity);
                    System.out.println(a.getQuantity());
                    receipt.add(ID, a.getMedicineName(), a.getMedPrice(), quantity, quantity * a.getMedPrice());
                    return true;
                } else if (a.getQuantity() == 0) {
                    System.out.println("There are no available medicine.");
                } else {
                    System.out.println("There are only " + a.getQuantity() + " available.");
                    break;
                }
            }
        }
        return false;
    }

    public void populate() {
        allergyMeds.add(new AllergyMedicine(401, "Cetirizine Dihydrochloride", 20.25, 30,
                "BRAND NAME:Zyriz; GENERIC NAME:Cetirizine Dihydrochloride; USES:for allergies"));
        allergyMeds.add(new AllergyMedicine(402, "Loratadine", 23.75, 30,
                "BRAND NAME:Lorexa QD; GENERIC NAME:Loratadine; USES:for allergies"));
        allergyMeds.add(new AllergyMedicine(403, "Antihistamine", 22.15, 30,
                "BRAND NAME:Allerta; GENERIC NAME:Antihistamine; USES:for allergies"));
    }

    public void displayMed(int Id) {
        System.out.println("\n\t\t\t- Medicine's Information -");
        allergyMeds.stream().filter((allergyMed) -> (allergyMed.getMedId() == Id)).map((allergyMed) -> {
            System.out.println("Name : " + allergyMed.getMedicineName());
            return allergyMed;
        }).map((allergyMed) -> {
            System.out.println("Description : " + allergyMed.getMedDesc());
            return allergyMed;
        }).map((allergyMed) -> {
            System.out.println("Price : " + allergyMed.getMedPrice());
            return allergyMed;
        }).forEach((allergyMed) -> {
            System.out.println("Quantity : " + allergyMed.getQuantity());
        });
    }

    public double price(int id) {
        for (AllergyMedicine allergyMed : allergyMeds) {
            if (allergyMed.getMedId() == id) {
                return allergyMed.getMedPrice();
            }
        }
        return 0;
    }

    public void run(int age) {
        displayMeds();
        Scanner inputID = new Scanner(System.in);
        int ID = inputID.nextInt();
        displayMed(ID);
        System.out.println("\nDo you want to purchase ? (y / n)");
        System.out.print("Enter choice : ");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        if ("y".equals(choice)) {
            Scanner inputquan = new Scanner(System.in);
            System.out.print("Quantity : ");
            int quantity = inputquan.nextInt();
            boolean purchase = updateMed(ID, quantity);
            if (purchase == true) {
                user.setTotalAmount((quantity * price(ID)) + user.getTotalAmount());
                System.out.println("Total Amount: " + user.getTotalAmount());
                receipt.retrieve();
            }
        }
    }
}
