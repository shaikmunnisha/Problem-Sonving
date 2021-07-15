package com.practice.arrays;

public class BackwardFunction {
    public static void main(String[] args) {
        int [] arr = {2,5,6,1,9,10,3};

        //input values os array
        int temp=-1,j,i;
        System.out.println("Array before processing : ");
        PrintArray.print(arr);
        //starting loop,here we are adding two loops in one array
        //We are iterating array from both start and end index
        for(i=0,j=arr.length-1; i<j; i++,j-- ){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("Array after processing : ");
        PrintArray.print(arr);
    }
}
