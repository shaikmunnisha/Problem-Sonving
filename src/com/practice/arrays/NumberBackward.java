package com.practice.arrays;

public class NumberBackward {
    public static void main(String[] args) {

        //size of the array declaration
        int[] arr = {1, 0, 0, 1, 0, 0, 1, 0, 1, 0};

        // declaration of array and input
        int temp = -1, j = arr.length - 1, i = 0;

        System.out.println("Array before processing : ");
        PrintArray.print(arr);
        // TBA
        for (i = 0, j = arr.length - 1; i < j; ){
            if (arr[i] == 1 && arr[j] == 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if (arr[i] == 0)
                      i++;
                 if (arr[j] == 1)
                      j--;
        }
        System.out.println("Array after processing : ");
        PrintArray.print(arr);
    }
}