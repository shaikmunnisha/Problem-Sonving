package com.practice.ifconditions;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        System.out.println("Hello Munni...  !!!");
        Scanner sc= new Scanner(System.in);
        System.out.println("Input : Please enter the number & press enter:");
        int number=sc.nextInt();

        if(number>0)
             System.out.println("Output : Number is positive");
        else
            System.out.println("Output : Number is negative");

    }
}
