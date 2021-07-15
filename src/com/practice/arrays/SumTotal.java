package com.practice.arrays;

public class SumTotal {
    public static void main(String[] args) {
        int [] arr = {2,5,6,1,9,10,3};
        //sum value starts with 0 and input value is 7 - array size is 7
        int sum = 0, n=7;

        for( int i = 0; i < n; i++){
            //formula of total sum
            sum = sum + arr[i];
        }
        System.out.println("Total sum of all the index values of array is : "+sum);
    }
}
