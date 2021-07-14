package com.practice.ifconditions;

import java.util.Scanner;

public class EqualOrNot {
    public static void main(String[] args) {
        System.out.println("Hello Munni...  !!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : Please enter the integer is equal or not & press enter:");
        int integer1 = sc.nextInt();
        System.out.println("Input : Please enter the integer is equal or not & press enter:");
        int integer2 = sc.nextInt();

        if (integer1 == integer2)
            System.out.println("Output : integer1 and integer2 are equal");
        else
            System.out.println("output : integer1 and integer2 are not equal");

    }
}