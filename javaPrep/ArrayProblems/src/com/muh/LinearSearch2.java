package com.muh;

public class LinearSearch2 {

    public static void main(String[] args) {

        int [] aar = {45, 43, 76, 23, 63, 89, 23, 48, 93, 56};

        int target = 99;

        boolean ls = linearSearch2( aar, target);

        System.out.println(ls);


    }

    static boolean linearSearch2( int[] arr, int target){

        for ( int index = 0; index < arr.length; index++ ){

            int element  = arr[index];

            if ( element == target){
                return true;
            }

        } return false;
    }
}
