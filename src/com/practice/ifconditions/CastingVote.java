package com.practice.ifconditions;

import java.util.Scanner;

public class CastingVote {
    public static void main(String[] args) {
        System.out.println("Hello Munni...  !!!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Input : Please enter the age & press enter:");
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("eligible for casting vote");
        else
            System.out.println("is not eligible for casting vote");
    }
}
