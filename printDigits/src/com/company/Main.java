package com.company;
import java.util.Scanner;
public class Main{


    public static void main(String[] args) {

        String name;
        int marks;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        marks = input.nextInt();
        char grade;
        if (marks>100)
        {
            grade='A';
        }
        else if (marks>80&&marks<=100)
        {
            grade='B';
        }
        else if (marks>60&& marks<=80)
        {
            grade='C';
        }
        else if (marks>40&&marks<=60)
        {
            grade='D';
        }
        else
        {
            grade='E';
        }
        System.out.println("The grade scored by "+name+ " is " +grade);
    }
}



