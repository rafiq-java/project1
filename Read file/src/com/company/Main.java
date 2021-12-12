package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        File input = new File("/Users/smoha/OneDrive/Desktop/quiz_numbers.txt");
        Scanner inp = new Scanner(input);
        double sum=0,n=0,mean;
        for(int i=0;inp.hasNext();i++){
            sum=sum+inp.nextInt();
            n++;
        }
        mean=(sum/n);
        System.out.println(mean);
    }
}
