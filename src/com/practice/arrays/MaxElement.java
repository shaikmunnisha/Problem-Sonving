package com.practice.arrays;

public class MaxElement {


    public static void main(String[] args) {

        int  arr []={3,4,8,8,9,1,2};
        //int i;
        int max=Integer.MIN_VALUE;
        
        for(int i=0 ; i<arr.length;i++){
            if (max < arr[i])
                max=arr[i];
        }
        //varible and string concatination by using + operator
        System.out.println("max element of array is : "+max);
        //System.out.println("value of i after loop completion : "+i);
    }

}
