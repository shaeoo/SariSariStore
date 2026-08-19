/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sarisaristore;
import java.util.Scanner;
import java.util.ArrayList;
        
/**
 *
 * @author shawn
 */
public class SariSariStore {
    
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }
    
    private static void showMenu(){
        System.out.println("Categories");
        System.out.println("1 - Drinks\n2 - Snacks");
        System.out.print("Enter your choice: ");
        String categoryInput = input.nextLine();
        
        int category = Integer.parseInt(categoryInput);
        
        switch (category) {
            case 1: 
                System.out.println("YOu chose 1");
                showDrinks();
                break;
            case 2: 
                System.out.println("You chose 2");
                break;
            default: 
                System.out.println("Please enter a valid choice");
        }
    }
    
    private static void showDrinks() {
        ArrayList<Integer> list = new ArrayList<>();
        boolean wantAnother = true;
        ArrayList<String> cart = new ArrayList<>();
        
        while (wantAnother) {
            System.out.println("Choose a drink");
            System.out.println("1 - Coke\n2 - C2\n3 - Coffee");

            System.out.print("Enter your choice: ");
            String choiceInput = input.nextLine();

            int choice = Integer.parseInt(choiceInput);

            switch (choice) {
                case 1:
                    list.add(15);
                    cart.add("coke");
                    break;
                case 2:
                    list.add(25);
                    cart.add("C2");
                    break;
                case 3:
                    list.add(50);
                    cart.add("Coffee");
                    break;
                default:
                    System.out.println("Enter a valid choice!");
            }

            System.out.print("Do you want to buy another drinks? (y/n): ");
            String another = input.nextLine();

            if (!another.equalsIgnoreCase(another)) wantAnother = false;
        }
        
        System.out.println("Payment na!!!");        

        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            int id = list.get(i);
            String item = cart.get(i);

            System.out.printf("ID: %d; Item: %s \n", id, item);
            total += id;
        }
        
        System.out.printf("Total %d", total);
        
        Cart mycart = new Cart(2, "coke", 40);
        System.out.println(mycart);
    }
    
    
}
