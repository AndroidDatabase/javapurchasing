/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author toringje_sd2022
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("---Welcome to JessMel Pharmacy---");
        Medicine coughMeds = new CoughMedicine();
        coughMeds.populate();
        Medicine headacheMeds = new HeadacheMedicine();
        headacheMeds.populate();
        Medicine painrelievers = new PainRelieverMedicine();
        painrelievers.populate();
        Medicine allergyMeds = new AllergyMedicine();
        allergyMeds.populate();

        System.out.print("\nCustomer's age : ");
        boolean done = false;
        Scanner input1 = new Scanner(System.in);
        int customerAge = input1.nextInt();
        System.out.print("Customer's Name : ");
        Scanner input2 = new Scanner(System.in);
        String customerName = input2.nextLine();
        if (customerAge >= 60) {
            User senior = new Senior(customerName, customerAge);
            while (done == false) {
                System.out.println("\nTypes of Medicines : ");
                System.out.println("\t1 -- for cough\n\t2 -- for headache\n\t3 -- for pain reliever\n\t4 -- for allergy\n\t5 -- Pay");
                System.out.print("Please choose your choice : ");
                Scanner input3 = new Scanner(System.in);
                int choice1 = input3.nextInt();
                switch (choice1) {
                    case 1:
                        System.out.println("");
                        coughMeds.displayMeds();
                        System.out.print("Please enter medicine id :");
                        Scanner input4 = new Scanner(System.in);
                        int choice2 = input4.nextInt();
                        coughMeds.displayMed(choice2);
                        System.out.println("\n\t1 -- Purchase\n\t2 -- Exit");
                        Scanner input8 = new Scanner(System.in);
                        int choice6 = input8.nextInt();
                        if (choice6 == 1) {
                            Scanner input9 = new Scanner(System.in);
                            System.out.print("Quantity : ");
                            int choice7 = input9.nextInt();
                            coughMeds.updateMed(coughMeds, choice7);
                            System.out.println("Amount: " + senior.getTotalAmount());
                            senior.setTotalAmount((choice7 * coughMeds.price(choice2))+senior.getTotalAmount());
                            System.out.println("Total Amount: " + senior.getTotalAmount());
                        } else {
                            break;
                        }
                        break;
                    case 2:
                        System.out.println("");
                        headacheMeds.displayMeds( );
                        System.out.print("Please enter medicine id :");
                        Scanner input5 = new Scanner(System.in);
                        int choice3 = input5.nextInt();
                        headacheMeds.displayMed(choice3);
                        System.out.println("\n\t1 -- Purchase\n\t2 -- Exit");
                        Scanner input10 = new Scanner(System.in);
                        int choice8 = input10.nextInt();
                        if (choice8 == 1) {
                            Scanner input9 = new Scanner(System.in);
                            System.out.println("Amount: " + senior.getTotalAmount());
                            System.out.print("Quantity : ");
                            int choice7 = input9.nextInt();
                            headacheMeds.updateMed(headacheMeds, choice7);
                            senior.setTotalAmount((choice7 * headacheMeds.price(choice3))+senior.getTotalAmount());
                            System.out.println("Initial Total Amount: " + senior.getTotalAmount());
                        }
                        break;
                    case 3:
                        System.out.println("");
                        painrelievers.displayMeds();
                        System.out.print("Please enter medicine id :");
                        Scanner input6 = new Scanner(System.in);
                        int choice4 = input6.nextInt();
                        painrelievers.displayMed(choice4);
                        System.out.println("\n\t1 -- Purchase\n\t2 -- Exit");
                        Scanner input11 = new Scanner(System.in);
                        int choice9 = input11.nextInt();
                        if (choice9 == 1) {
                            Scanner input9 = new Scanner(System.in);
                            System.out.println("Amount: " + senior.getTotalAmount());
                            System.out.print("Quantity : ");
                            int choice7 = input9.nextInt();
                            painrelievers.updateMed(painrelievers, choice7);
                            senior.setTotalAmount((choice7 * painrelievers.price(choice4))+senior.getTotalAmount());
                            System.out.println("Initial Total Amount: " + senior.getTotalAmount());
                        }
                        break;
                    case 4:
                        System.out.println("");
                        allergyMeds.displayMeds();
                        System.out.print("Please enter medicine id :");
                        Scanner input7 = new Scanner(System.in);
                        int choice5 = input7.nextInt();
                        allergyMeds.displayMed(choice5);
                        System.out.println("\n\t1 -- Purchase\n\t2 -- Exit");
                        Scanner input12 = new Scanner(System.in);
                        int choice10 = input12.nextInt();
                        if (choice10 == 1) {
                            Scanner input9 = new Scanner(System.in);
                            System.out.println("Amount: " + senior.getTotalAmount());
                            System.out.print("Quantity : ");
                            int choice7 = input9.nextInt();
                            allergyMeds.updateMed(allergyMeds, choice7);
                            senior.setTotalAmount((choice7 * allergyMeds.price(choice5))+senior.getTotalAmount());
                            System.out.println("Initial Total Amount: " + senior.getTotalAmount());
                        }
                        break;
                    case 5:
                        System.out.println("\nYou have 20% discount...");
                        System.out.print("Total amount to pay: ");
                        System.out.println(senior.totalAmountPaid());
                        System.out.println("Thank you!");
                        done = false;
                        break;
                    default:
                        System.out.println("None of the choice!");
                        break;
                }
            }
        } else if (customerAge < 60 && customerAge >= 18) {
            User adult = new Adult(customerName, customerAge);
            while (done == false) {
                System.out.println("\nTypes of Medicines : ");
                System.out.println("\t1 -- for cough\n\t2 -- for headache\n\t3 -- for pain reliever\n\t4 -- for allergy\n\t5 -- Pay");
                System.out.print("Please choose your choice : ");
                Scanner input3 = new Scanner(System.in);
                int choice1 = input3.nextInt();
                switch (choice1) {
                    case 1:
                        System.out.println("");
                        coughMeds.displayMeds();
                        System.out.print("Please enter medicine id :");
                        Scanner input4 = new Scanner(System.in);
                        int choice2 = input4.nextInt();
                        coughMeds.displayMed(choice2);
                        System.out.println("\n\t1 -- Purchase\n\t2 -- Exit");
                        Scanner input8 = new Scanner(System.in);
                        int choice6 = input8.nextInt();
                        if (choice6 == 1) {
                            Scanner input9 = new Scanner(System.in);
                            System.out.println("Amount: " + adult.getTotalAmount());
                            System.out.print("Quantity : ");
                            int choice7 = input9.nextInt();
                            coughMeds.updateMed(coughMeds, choice7);
                            adult.setTotalAmount((choice7 * coughMeds.price(choice2))+adult.getTotalAmount());
                            System.out.println("Initial Total Amount: " + adult.getTotalAmount());
                        }
                        break;
                    case 2:
                        System.out.println("");
                        headacheMeds.displayMeds();
                        System.out.print("Please enter medicine id :");
                        Scanner input5 = new Scanner(System.in);
                        int choice3 = input5.nextInt();
                        headacheMeds.displayMed(choice3);
                        System.out.println("\n\t1 -- Purchase\n\t2 -- Exit");
                        Scanner input10 = new Scanner(System.in);
                        int choice8 = input10.nextInt();
                        if (choice8 == 1) {
                            Scanner input9 = new Scanner(System.in);
                            System.out.println("Amount: " + adult.getTotalAmount());
                            System.out.print("Quantity : ");
                            int choice7 = input9.nextInt();
                            headacheMeds.updateMed(headacheMeds, choice7);
                            adult.setTotalAmount((choice7 * headacheMeds.price(choice3))+adult.getTotalAmount());
                            System.out.println("Initial Total Amount: " + adult.getTotalAmount());
                        }
                        break;

                    case 3:
                        System.out.println("");
                        painrelievers.displayMeds();
                        System.out.print("Please enter medicine id :");
                        Scanner input6 = new Scanner(System.in);
                        int choice4 = input6.nextInt();
                        painrelievers.displayMed(choice4);
                        System.out.println("\n\t1 -- Purchase\n\t2 -- Exit");
                        Scanner input11 = new Scanner(System.in);
                        int choice9 = input11.nextInt();
                        if (choice9 == 1) {
                            Scanner input9 = new Scanner(System.in);
                            System.out.println("Amount: " + adult.getTotalAmount());
                            System.out.print("Quantity : ");
                            int choice7 = input9.nextInt();
                            painrelievers.updateMed(painrelievers, choice7);
                            adult.setTotalAmount((choice7 * painrelievers.price(choice4))+adult.getTotalAmount());
                            System.out.println("Initial Total Amount: " + adult.getTotalAmount());
                        }
                        break;

                    case 4:
                        System.out.println("");
                        allergyMeds.displayMeds();
                        System.out.print("Please enter medicine id :");
                        Scanner input7 = new Scanner(System.in);
                        int choice5 = input7.nextInt();
                        allergyMeds.displayMed(choice5);
                        System.out.println("\n\t1 -- Purchase\n\t2 -- Exit");
                        Scanner input12 = new Scanner(System.in);
                        int choice10 = input12.nextInt();
                        if (choice10 == 1) {
                            Scanner input9 = new Scanner(System.in);
                            System.out.println("Amount: " + adult.getTotalAmount());
                            System.out.print("Quantity : ");
                            int choice7 = input9.nextInt();
                            allergyMeds.updateMed(allergyMeds, choice7);
                            adult.setTotalAmount((choice7 * allergyMeds.price(choice5))+adult.getTotalAmount());
                            System.out.println("Initial Total Amount: " + adult.getTotalAmount());
                        }
                        break;
                    case 5:
                        System.out.print("\nTotal amount to pay: ");
                        System.out.println(adult.totalAmountPaid());
                        System.out.println("Thank you!");
                        done = true;
                        break;
                    default:
                        break;
                }
            }
        } else {
            System.out.println("Your under age!");
        }

    }

}
