package com.muh;

public class Main {

    public static void main(String[] args) {

        int [] nums = { 22, 34, 56, 76 ,98, 58, 23, 90 };

        int target = 20;

       int ans =  linearSearch( nums, target);

        System.out.println(ans);

    }
    // Making Function for linear search:
    // If the item found return the index,
    // else return -1

    static int linearSearch( int[] arr, int target){

        for ( int index = 0; index < arr.length ; index++ ) {

            //check for every element at every index is = target
            int element = arr[index];

            if( element == target ){
                return index;
            }
        }
        return -1;
    }
}
