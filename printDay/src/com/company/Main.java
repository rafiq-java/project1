package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        // Enter month
        String month = scan.next();
        // Enter date
        int date = scan.nextInt();
        int num;
        int day = 0;
        switch (month) {
            case "January":
                day = date;
                break;
            case "February":
                day = 31 + date;
                break;
            case "March":
                day = 28 + 31 + date;
                break;
            case "April":
                day = 31 + 31 + 28 + date;
                break;
            case "May":
                day = 30 + 31 + 30 + 28 + date;
                break;
            case "June":
                day = 31 + 30 + 31 + 30 + 28 + date;
                break;
            case "July":
                day = 30 + 31 + 30 + 31 + 30 + 28 + date;
                break;
            case "August":
                day = 31 + 30 + 31 + 30 + 31 + 30 + 28 + date;
                break;
            case "September":
                day = 31 + 31 + 30 + 31 + 30 + 31 + 30 + 28 + date;
                break;
            case "October":
                day = 30 + 31 + 31 + 30 + 31 + 30 + 31 + 30 + 28 + date;
                break;
            case "November":
                day = 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 30 + 28 + date;
                break;
            case "December":
                day = 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 30 + 28 + date;
                break;
        }
        num=day;
        if (num%7==0||num%7==6) {
            System.out.println("Hurray!");
        }
         else {
            System.out.println("Oh! It's a workday :|");
        }
    }
}
