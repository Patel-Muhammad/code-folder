package com.muh;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
//            index =  0  1  2  3  4
        int[] array = {2, 4, 1, 9, 5};

        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            int lastIndex = arr.length -i - 1;
            int maxIndex = maxInd(arr, 0, lastIndex);

            swap(arr, maxIndex, lastIndex);
        }
    }
    static int maxInd (int[] arr, int start, int end ){
        int maxIndice = start;

        for (int i = start; i <= end ; i++) {
            if( arr[i] > arr[maxIndice] ){
               maxIndice = i ;
            }
        }
        return maxIndice;
    }

    static void swap( int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}

