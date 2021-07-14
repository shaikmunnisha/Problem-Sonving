package com.practice.ifconditions;

import java.util.Scanner;

public class EligibleCriteria {
    public static void main(String[] args) {
        System.out.println("Hello Munni...  !!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : Please enter the maths marks & press enter:");
        int maths = sc.nextInt();
        System.out.println("Input : Please enter the physics marks & press enter:");
        int physics = sc.nextInt();
        System.out.println("Input : Please enter the chemistry marks & press enter:");
        int chemistry = sc.nextInt();

        if (maths >= 65
                && physics >= 50
                && chemistry >= 50
                && maths + physics + chemistry >= 190
                && maths + physics >= 140)
            System.out.println("candidate is eligible for admission");
        else
            System.out.println(" candidate is not eligible for admission");
    }
}
