package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        //Scanner inp=new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        // Enter number 1 in the Input Console
        int num1 = scan.nextInt();
        // Enter number 2 in the Input Console
        int num2 = scan.nextInt();
        int hcf=0,num3,num4;
        if(num1>num2){
            num3=num1;
            num1=num2;
            num2=num3;
        }
       while(num2>num1){
           num3=num2%num1;
           if (num3==0){
               hcf=num1;
               System.out.println(hcf);
               break;
           }
           else{
               num4=num3;
               num3=num2;
               num2=num1;
               num1=num4;

           }
       }
            scan.close();
    }
    }
