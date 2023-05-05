package com.muh;

import java.util.Arrays;

public class IncreaseLastDigit {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4};
        plusOne(array);
        System.out.println(Arrays.toString(array));
    }
    static int[] plusOne( int[] arr){

        arr[arr.length - 1]++;
        if(arr[arr.length - 1]++ == 10){
            
        }

        return arr;
    }
}
