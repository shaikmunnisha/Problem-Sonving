package com.practice.ifconditions;

import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {
        System.out.println("Hello Munni...  !!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : Please enter the number whether it's +ve or -ve & press enter:");
        int number = sc.nextInt();

        if (number >= 0)
            System.out.println("number is positive");
        else
            System.out.println("number is negative");
    }
}


