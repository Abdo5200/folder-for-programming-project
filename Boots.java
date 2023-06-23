/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author user
 */
public class Boots extends FootballShop implements DiscConsiderable{
    private int size;
    public Boots(){
        
    }
    public Boots(String brand,double price,int quantity,int size){
        super(brand, price, quantity);
        this.size = size;
    }
    @Override
    public void display(){
        System.out.println("SOCCER BOOTS"+
                "\nBrand :"+getBrand());
        System.out.printf("Price :$%.2f for size %d",this.getPrice(),size);
        System.out.println("\nDiscount: 17.0%"+
                    "\nQuantity :"+getQuantity());
        System.out.printf("Subtotal: $%.2f\n\n",calcPrice());
    }
    @Override
    public double calcPrice(){
        return calcDisc()*getQuantity();
    }
    public double calcDisc(){
         return getPrice()-Rate*getPrice();

    }
}
