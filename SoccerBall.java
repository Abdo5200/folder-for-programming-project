/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author user
 */
public class SoccerBall extends FootballShop{
    private int ballType;
    //exception if ballType is greater than 4
    NotBallTypeException e = new NotBallTypeException(" Not a valid soccer ball type , Changing the soccer ball type to training ball");
    public SoccerBall(){
        
    }
    //constructor
    public SoccerBall(String brand,double price,int quantity,int ballType){
        super(brand,price,quantity);
        this.ballType = ballType;
    }
    //method to print out the ball attributes and price
    @Override
    public void display(){
        System.out.println("SOCCER BALL"+
                            "\nBrand :"+getBrand());
        try{
            
            switch (ballType) {
                case 1:
                    setPrice(200);
                    System.out.println("Type :Professional Match"+
                                    "\nPrice :$"+getPrice());
                    break;
                case 2:
                    setPrice(80);
                    System.out.println("Type :Match"+
                                    "\nPrice :$"+getPrice());
                    break;
                case 3:
                    setPrice(50);
                    System.out.println("Type :Trainig"+
                                    "\nPrice :$"+getPrice());
                    break;
                case 4:
                    setPrice(20);
                    System.out.println("Type :Recreational"+
                                    "\nPrice :$"+getPrice());
                    break;
                default:
                    throw e;
            }
            System.out.println("No Discount!"+
                                "\nQuantity :"+getQuantity());
            System.out.printf("Subtotal: $%.2f\n\n",calcPrice());
                                
        }
        catch(NotBallTypeException e){
            System.out.println(ballType+" "+e.getMessage()+"\n");
            ballType=3;
            display();
        }
    }
    //calculating price of package of balls
    @Override
    public double calcPrice(){
        return getQuantity()*getPrice();
    }
}
