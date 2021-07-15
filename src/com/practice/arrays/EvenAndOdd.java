package com.practice.arrays;

public class EvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 7, 4, 5, 6, 8, 1, 4, 5, 6};
        //declaration of integer
        int i;
        int j;
        int temp = -1;
        System.out.println("Array before processing : ");
        PrintArray.print(arr);
        for (i = 0, j = arr.length - 1; i < j; ) {
            //condition apply and formula of even and odd check
            if (arr[i] % 2 == 0 && arr[j] % 2 == 1) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if (arr[i] % 2 == 1)
                i++;
            if (arr[j] % 2 == 0)
                j--;
        }
        System.out.println("Array after processing : ");
        PrintArray.print(arr);
    }
}
