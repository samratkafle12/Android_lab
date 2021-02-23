package com.example.java;

public class Daffodals {
    public static void main(String[] args) {

        System.out.println("print daffodils number from 1 to 9999 are:");
        for(int i=1;i<=9999;i++){
            int a=i%10;
            int b=(i/10)%10;
            int c=i/100;


            if(i==a*a*a+b*b*b+c*c*c){

                System.out.print(i+",");

            }
        }
    }
}