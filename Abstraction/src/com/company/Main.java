package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int l = 10, b = 20, h = 30;
        System.out.println("area is  " + area(l,b,h));
        Scanner inp=new Scanner(System.in);
        square s1=new square();
        System.out.println("areq of Sqaure S1 :" + s1.area());
        square s2 = new square();
        System.out.println("areq of Sqaure S2 :" + s2.area());
        System.out.println("Private s1: " + s1.getHeight() + " " + "Private s2: "+ s2.getHeight());
    }
        public static int area(int l, int b, int h){
            return l*b*h;
        }



    }

