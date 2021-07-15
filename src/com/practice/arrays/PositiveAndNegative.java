package com.practice.arrays;

public class PositiveAndNegative {
    public static void main(String[] args) {
        int [] arr = {1,-1,-2,2,3,-4,7,-7,-8,9,7};

        System.out.println("Array before processing : ");
        PrintArray.print(arr);
        //taking extra variable
        int temp,i,j;
        //loop starting and using two inputs together
        for(i=0, j=arr.length-1;i<j;  ){
            //condition checking
            if (arr[i] < 0 && arr[j] >= 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if(arr[i]>=0)
                i++;
            if(arr[j]<0)
                j--;
        }
        System.out.println("Array after processing : ");
        PrintArray.print(arr);
    }
}
