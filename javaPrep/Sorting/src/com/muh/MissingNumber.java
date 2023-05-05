package com.muh;


import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        //            0  1  2  3  4
        int[] arr = { 0, 9, 1, 3};

        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr){

        int i = 0;
        while(i < arr.length){

            int correct = arr[i];

            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap( arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap( int[] arr, int first, int second ){
       int temp = arr[first];
       arr[first] = arr[second];
       arr[second] = temp;
    }

}
