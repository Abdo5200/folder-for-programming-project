/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author user
 */
public abstract class FootballShop{
    private String brand;
    private int quantity;
    private double price;
    public FootballShop(){
        
    }
    //constructor to initialize class attributes
    public FootballShop(String brand,double price,int quantity){
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }
    //getter and setters
    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //abstract methods
    public abstract void display();
    public abstract double calcPrice();
}
