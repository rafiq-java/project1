package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String coffee;
        int code;
        Scanner inp=new Scanner(System.in);

        coffee=inp.nextLine();
        switch (coffee)
        {
            case "Capuccino":
                System.out.println(coffee);
                break;
            case "Latte":
                System.out.println("Latte");
                break;
            default:
                System.out.println("select");

        }
    }
}
