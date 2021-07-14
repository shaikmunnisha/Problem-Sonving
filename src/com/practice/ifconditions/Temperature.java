package com.practice.ifconditions;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Hello Munni...  !!!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Input : Please enter the temp value & press enter:");
        int temp = sc.nextInt();

        if (temp < 0)
            System.out.println("is freezing weather");
        else if (temp < 10)
            System.out.println("is very cold weather");
        else if (temp < 20)
            System.out.println("is cold weather");
        else if (temp < 30)
            System.out.println("is normal");
        else if (temp < 40)
            System.out.println("is hot");
        else if (temp >= 40)
            System.out.println("is very hot");
    }
}


