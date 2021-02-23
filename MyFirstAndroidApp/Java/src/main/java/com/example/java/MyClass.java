package com.example.java;

public class MyClass {
    public static void main(String[] args) {
        //System.out.println("hello world!");
        int rooster, hen, chicken;

        for (rooster = 1; rooster<=20; rooster++)
        {
            for (hen=1;hen<=33;hen++)
            {
                chicken = 100-rooster-hen;

                if (5*rooster+3*hen+(1/3)*chicken==100&&chicken%3==0)
                {
                    System.out.println("rooster:"+rooster+"\then:"+hen+"\t  chick:"+chicken);
                }
            }
        }

    }
}