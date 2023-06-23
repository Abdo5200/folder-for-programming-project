package com.mycompany.project;

public class GameCharacter {
    public void attack(Weapon wp){
        System.out.println(wp.getName());
        System.out.println(wp.getDamage());
        System.out.println(wp.getRange());
        wp.specialAttack();
    }
}
