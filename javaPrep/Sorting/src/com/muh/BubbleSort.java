package com.muh;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        //             0    1   2   3   4  5
        int[] array = { 67, 23, 30, 9, 99, 2};

        bubbleSort(array);

        System.out.println(Arrays.toString(array));

    }

    static void bubbleSort( int[] arr){

        boolean swapped;

        for (int i = 0; i < arr.length ; i++) {
            swapped = false;

            //This loop runs n-1 times, n = number of elements i.e. 6
            //Total elements are 6, but the cycle of comparitions go only 4 times
            //=>  i = 0 to 4
            // at i = 5 , array.length-i = 6-5 = 1, which is equal to j, therefore j !< 1, it is equal to 1

            for (int j = 1; j < arr.length -i; j++) {

            // j = number of compartions
/*
*    for, i = 0, j = 1, 2, 3, 4, 5
*      i = 1, j = 1, 2, 3, 4
*      i = 2, j = 1, 2, 3
*      i = 3, j = 1, 2
*      i = 4, j = 1
*      i = 5, j = not defined as -> at i = 5 ,
*                                   array.length-i = 6-5 = 1, which is equal to j,
*                                   therefore j !< 1, it is equal to 1
* */
                if( arr[j] < arr[j-1]){
            //swap
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j -1] = temp;
                    swapped = true;
                }
            }
            // if it didn't swap for a particular value of i, then the array is already sorted.
            // no need to check for other values of i
            if( !swapped ){
                break;
            }
        }
    }
}