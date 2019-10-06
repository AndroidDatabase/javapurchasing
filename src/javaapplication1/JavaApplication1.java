/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import static javaapplication1.ListOfReceipts.retrieve;
import static javaapplication1.ListOfUsers.adults;
import static javaapplication1.ListOfUsers.seniors;

/**
 *
 * @author toringje_sd2022
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListOfUsers users = new ListOfUsers();
        ListOfAllergyMed a = new ListOfAllergyMed();
        ListOfCoughMed c = new ListOfCoughMed();
        ListOfHeadAcheMed h = new ListOfHeadAcheMed();
        ListOfPainRelieverMed p = new ListOfPainRelieverMed();
        ListOfReceipts receipt = new ListOfReceipts();
        boolean exit = false;
        boolean loggedIn = false;
        boolean pay = false;
        String username = null;
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        System.out.println("---Welcome to JessMel Pharmacy---");

        while (exit == false) {
            System.out.println("\n C H O I C E S \n1 -- Register\n2 -- Log in\n3 -- exit");
            System.out.print("Enter choice : ");
            String choice1 = input1.nextLine();
            switch (choice1) {
                case "1":
                    users.register();
                    break;
                case "2":
                    username = users.logIn();
                    loggedIn = true;
                    exit = true;
                    break;
                case "3":
                    exit = true;
                    break;
            }
        }
        while (pay == false) {
            System.out.println("\n C H O I C E S \n1 -- Types of medicines\n2 -- Pay");
            System.out.print("Enter choice : ");
            String choice2 = input2.nextLine();
            switch (choice2) {
                case "1":
                    System.out.println("\nTypes of Medicines : ");
                    System.out.println("\t1 -- for cough\n\t2 -- for headache\n\t3 -- for pain reliever\n\t4 -- for allergy\n");
                    System.out.print("Enter choice : ");
                    String choice3 = input3.nextLine();
                    if ("1".equals(choice3)) {
                        c.run(username);
                    } else if ("2".equals(choice3)) {
                        h.run(username);
                    } else if ("3".equals(choice3)) {
                        p.run(username);
                    } else if ("4".equals(choice3)) {
                        a.run(username);
                    }
                    break;
                case "2":
                    System.out.println("\n--- P A Y ---");
                    boolean end = false;
                    for (Adult adult : adults) {
                        if (adult.getName().equals(username)) {
                            adult.totalAmountPaid();
                            retrieve();
                            System.out.println("Your total payment is " + adult.getTotalAmount());
                            end = true;
                            break;
                        }
                    }
                    if (end == true) {
                        pay = true;
                        break;
                    }
                    for (Senior senior : seniors) {
                        if (senior.getName().equals(username)) {
                            senior.totalAmountPaid();
                            retrieve();
                            System.out.println("\n20% discount!");
                            System.out.println("Your total payment is " + senior.getTotalAmount());
                            break;
                        }
                    }
                    pay = true;
                    break;
            }

        }
//
    }

}
