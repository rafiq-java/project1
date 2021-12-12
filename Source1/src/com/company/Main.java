package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        // write your code here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            int pos,neg,temp=0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            pos=countPos(arr, temp);
            int positive[] = new int[pos];
            temp=0;
            neg=countNeg(arr, temp);

            int negative[] = new int[neg];
            partitionNegativeAndPositive(n, arr,positive,negative);
            if(arr[0] >=0) {
                if (neg == 0) {
                    for (int i = 0; i < positive.length; i++) {
                        System.out.print(positive[i] + " ");
                    }System.out.print("\n" + "Array doesn't have negative numbers");
                } else{
                    printPosNeg(positive, negative);
                }
                } else {
                if(pos==0){
                for (int i = 0; i < negative.length; i++) {
                    System.out.print(negative[i] + " ");
                } System.out.print("\n" + "Array doesn't have positive numbers");
                } else{
                    printPosNeg(negative, positive);
                }
            }

        }

    public static void printPosNeg(int[] positive, int[] negative) {
        for (int i = 0; i < positive.length; i++) {
            System.out.print(positive[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < negative.length; i++) {
            System.out.print(negative[i] + " ");
            }
    }

    public static int countPos(int arr[],int temp){
            for(int i=0;i<=arr.length-1;i++){
                if (arr[i]>=0){
                    temp++;
                }
            }
            return temp;
        }
         public static int countNeg(int arr[],int temp){
             for(int i=0;i<=arr.length-1;i++){
                 if (arr[i]<0){
                temp++;
                 }
             }
            return temp;
         }
        public void printPositive(int arr [], int positive[]){

        }
        // Method to partition negative and positive numbers without comparing with 0
         static void partitionNegativeAndPositive ( int n, int arr[], int positive[], int negative[]){
            // Write your code here
             int temp1=0,temp2=0;
            for (int i=0;i<=arr.length-1;i++){
                if (arr[i]>=0){
                    positive[temp1]=arr[i];
                    temp1++;
                }
                else{
                    negative[temp2]=arr[i];
                    temp2++;
                }
            }
        }
}


