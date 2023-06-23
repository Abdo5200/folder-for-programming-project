package com.mycompany.project;

public  class Bow extends AB implements Weapon{
    private String name;
     int range , damage;
    public Bow(String name,int damage,int range){
        this.name = name;
        this.range=range;
        this.damage=damage;
    }
    public static void change(Bow el){
        el.damage/=10;
    }
    public String getName(){
        return name;
    }
    public int getDamage(){
        return damage;
    }
    public int getRange(){
        return range;
    }
    public void specialAttack(){
        System.out.println("Arrow Shot");
    }
    public void x(){
        System.out.println("ss");
    }
}
