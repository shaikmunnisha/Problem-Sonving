package com.practice.loops;

public class StarPattern6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=n+1-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
