package com.practice.loops;

public class StarPattern5 {
    public static void main(String[] args) {
        int k, r = 1,n=4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(r);
                r = r + 1;
            }
            System.out.println();
        }
    }
}
