package com.mycompany.project;
import java.util.*;
public class NEW{
    private static int x;

    public static double sum(double n){
        x =10;
        if(n==0)
            return 0;
        double res = n/(2*n+1);
        return (res+sum(n-1));
    }
        public static void main(String[] args)
        {
//            Bow b = new Bow("ahmed",10,20);
//            Bow c = new Bow("mohamed",30,40);
//            swap(b,c);
//            System.out.println(b.getDamage()+"    " +c.getDamage());
            String s = "ahmed";
            System.out.println(s.substring(0,1));
        }
        public static void swap(Bow x,Bow y){
        Bow temp = x;
        x= y;
        y = temp;
        }
    }

