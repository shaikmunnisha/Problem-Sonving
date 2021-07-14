package com.practice.loops;

public class AlphabetPattern1 {
    public static void main(String[] args) {
        System.out.println("Hello Munni....!!");
        int n ='E';
        for (int i='A';i<=n;i++) {
            for(int k='A';k<=n-i;k++){
                System.out.print(" ");
            }
            for (int j='A';j<=i;j++) {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }}
