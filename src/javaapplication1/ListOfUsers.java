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
 * @author 2ndyrGroupC
 */
public class ListOfUsers {

    ArrayList<Adult> adults;
    ArrayList<Senior> seniors;
    private String name;
    private String password;
    private int age;
    private double total;
    Scanner inputName = new Scanner(System.in);
    Scanner inputPass = new Scanner(System.in);
    Scanner inputAge = new Scanner(System.in);

    public ListOfUsers() {
        adults = new ArrayList();
        seniors = new ArrayList();
        adults.add(new Adult("melvin", 22, "melvin123", 0.0));
        seniors.add(new Senior("toring", 60, "toring123", 0.0));
    }

    public void register() {
        System.out.println("\n*** REGISTER ***");
        System.out.print("Enter username : ");
        name = inputName.nextLine();
        System.out.print("Enter password : ");
        password = inputPass.nextLine();
        System.out.print("Enter age : ");
        age = inputAge.nextInt();

        if (age < 18) {
            System.out.println("You are under age!");
        } else if (age >= 60) {
            seniors.add(new Senior(name, age, password, total));
            System.out.println("You are registered!");
        } else {
            adults.add(new Adult(name, age, password, total));
            System.out.println("You are registered!");
        }
    }

    public int logIn() {
        System.out.println("\n*** LOG IN ***");
        System.out.print("Enter username : ");
        name = inputName.nextLine();

        for (int i = 0; i < adults.size(); i++) {
            if (adults.get(i).getName().equals(name)) {
                while (true) {
                    System.out.print("Enter password : ");
                    password = inputPass.nextLine();
                    if (adults.get(i).getPassword().equals(password)) {
                        System.out.println("You are now logged in!");
                        return adults.get(i).getAge();
                    } else {
                        System.out.println("Incorrect password!");
                    }
                }
            } else if (i == adults.size() - 1) {
                System.out.println("You are not yet registered!");
            }
        }
        return 0;
    }
    
}
