package com.practice.ifconditions;

import java.util.Scanner;

public class FindTheColour {
    public static void main(String[] args) {
        System.out.println("Hello Munni...  !!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : Please enter the number to find the colour & press enter:");
        int blue = sc.nextInt();
        System.out.println("Input : Please enter the number to find the colour & press enter:");
        int red = sc.nextInt();
        System.out.println("Input : Please enter the number to find the colour & press enter:");
        int green = sc.nextInt();
        //input value should be 1-30
         int n=30;
        if (n <= 10 && n > 0)
            System.out.println("output :colour is blue");
        else if (n > 10 && n <= 20)
            System.out.println("output :colour is red");
        else if (n > 20 && n <= 30)
            System.out.println("output :colour is green");
        else
            System.out.println("please enter number 1-30");
    }
}