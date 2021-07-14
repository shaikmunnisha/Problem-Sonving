package com.practice.ifconditions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Hello Munni....!!");
        Scanner sc= new Scanner(System.in);

        System.out.println("Input : Please enter the number to check if it's EVEN or ODD & press enter:");
        int number=sc.nextInt();

        if(number%2==0)
            System.out.println("Output : Number is Even");
        else
            System.out.println("Output : Number is Odd");
    }
}
