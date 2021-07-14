package com.practice.ifconditions;

import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {
        System.out.println("Hello Munni...  !!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input : Please enter the 1st cordinate & press enter:");
        int cord1 = sc.nextInt();
        System.out.println("Input : Please enter the 2nd cordinate & press enter:");
        int cord2 = sc.nextInt();

        if (cord1 > 0 & cord2 > 0)
            System.out.println("lies on first quedrant");
        else if (cord1 < 0 & cord2 > 0)
            System.out.println("lies on second quedrant");
        else if (cord1 < 0 & cord2 < 0)
            System.out.println("lies on third quedrant");
        else if(cord1 > 0 & cord2 < 0)
            System.out.println("lies on forth quedrant");
        else if (cord1 == 0 & cord2 == 0)
            System.out.println("lies on centre");
    }
}
