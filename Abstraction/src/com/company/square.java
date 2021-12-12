package com.company;
import java.util.*;
public class square {
    int l, b, h;
        public int area() {
        Scanner in=new Scanner(System.in);
        l=in.nextInt();
        b=in.nextInt();
        h=in.nextInt();
            return l * b * h;
    }
    private double ht;
    private double lt;

    public double getHeight(){
        ht=h;
        return ht;
    }
    public double getLength(){
        lt=l;
        return lt;
    }
}