package com.muh;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        //               0   1   2  3   4  5
        int[] array = { 67, 23, 30, 9, 99, 2};

        insertionSort(array);

        System.out.println(Arrays.toString(array));




    }

    static void swap( int arr[], int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void insertionSort( int arr[] ){

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1 ; j > 0; j--) {

                if( arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                
            }
            
        }
    }
}
