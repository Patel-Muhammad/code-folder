package com.muh;

public class minInArray {
    public static void main(String[] args) {

        int [] a = {34, 56, 64, 2, 84, 27, 16, 23};

        int minimum = minInArray(a);
        System.out.println(minimum);


    }

    static int minInArray( int[] arr ){
        int ans = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] < ans ){
                ans = arr[i];
            }
        }return ans;
    }
}
