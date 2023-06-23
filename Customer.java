/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;
/**
 *
 * @author user
 */
public class Customer {
    private String custName;
    private int numOfItems=0;
    double totalPay;
    FootballShop[] itemList = new FootballShop[10];
    public Customer(String custName){
        this.custName = custName;
    }
    public String getName(){
        return custName;
    }
    public double getTotalPay(){
        return totalPay;
    }
    public int getNumOfItems(){
        return numOfItems;
    }
    public void buy(FootballShop item){
        itemList[numOfItems]=item;
        numOfItems++;
        System.out.println("Item "+numOfItems);
        item.display();
        totalPay+=item.calcPrice();
        
    }
    @Override
    public String toString(){
        return "Welcome "+getName()+"\n\nList of Football Items Bought\n";
    }
    public void print(){
        System.out.printf("Total = $%.2f",getTotalPay());
    }
}
