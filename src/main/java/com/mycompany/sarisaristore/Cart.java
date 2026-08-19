/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sarisaristore;

/**
 *
 * @author shawn
 */
public class Cart {
    
    private int price;
    private String name;
    private int quantity;
    
    
    public Cart(int price, String name, int quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }
    
    public int getPrice() { return price; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
}
