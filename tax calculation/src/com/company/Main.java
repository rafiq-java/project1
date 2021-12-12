    package com.company;
    import java.util.*;
    public class Main {

        public static void main(String[] args) {
            // write your code here
            int age, sal;
            double tax1 = 0.1, tax2 = 0.2, tax3 = 0.3;
            double payTax,brack1,brack2,brack3,brack4,brack5;
            Scanner inp = new Scanner(System.in);
            age = inp.nextInt();
            sal = inp.nextInt();
            brack1=0.1*50000;
            brack2=((0.1*(sal-300000))+brack1);
            brack3=((0.2*(sal-500000))+(200000*0.1)+brack1);
            brack4=((0.3*(sal-1000000))+(0.2*500000)+(0.1*200000)+brack1);
            brack5=0.0;

            if (sal <= 250000) {
                System.out.println("No Tax");
            } else {
                if (sal > 250000 && sal <= 300000) {
                    if (age < 60) {
                        System.out.println("Tax " + brack1);
                    }
                    else {
                        System.out.println("nil");
                    }
                    } if (sal > 300000 && sal <= 500000) {
                        if (age < 80) {
                            System.out.println("tax "+brack2);
                        } else {
                            System.out.println("No Tax");
                        }
                    } else if (sal > 500000 && sal <= 1000000) {
                        System.out.println("tax "+brack3);
                    } else if (sal > 1000000) {
                        System.out.println("tax "+brack4);
                    }

                }
            }
        }

