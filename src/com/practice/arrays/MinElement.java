package com.practice.arrays;

public class MinElement {
    public static void main(String[] args) {
        int [] arr= {10,20,3,4,1,6,7,8};
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("Minimum element of array is : "+min);
    }
}
