package com.muh;

public class BinarySearchWithRecurssion {
    public static void main(String[] args) {

        //           0  1  2    3   4   5   6   7
        int[] arr = {6, 9, 11, 15, 19, 22, 28, 39};
        int target = 50;

        System.out.println(search(arr, target));


    }

    static int search(int arr[], int target) {

        int start = 0 ;
        int end = arr.length - 1 ;

        while ( start <= end ) {

            int mid = (start + end) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }return -1;

    }
}

