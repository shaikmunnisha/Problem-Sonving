package com.practice.loops;

public class StarPattern4 {
    public static void main(String[] args) {
        //no of rows
        int n=5;
        for (int i=1; i<=n; i++) {
            //This loop is for printing spaces in start
            for (int j=1; j<=n-i; j++) {
                System.out.println( );
            }
            //This loop is for printing *
            for(int k=1;k<=i;k++){
                 System.out.print("*");
            }
            //this line is for next line
            System.out.println( );
        }

        }
}

