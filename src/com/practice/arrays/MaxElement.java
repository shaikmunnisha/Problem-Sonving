package com.practice.arrays;

public class MaxElement {
    public static void main(String[] args) {
        int [] arr={3,4,8,8,9,1,2};
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if (max < arr[i])
                max=arr[i];
        }
        System.out.println("max element of array is : "+max);
    }

}
