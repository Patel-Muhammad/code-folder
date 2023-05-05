package com.muh;

import java.util.Arrays;

public class SeaechIn2DArray {
    public static void main(String[] args) {

        int [][] array = {
                {12, 54, 91},
                {8, 34, 99, 108},
                {94, 32},
                {65},
        };

        int targ = 108;

        int [] ans = search( array, targ);

        System.out.println(Arrays.toString(ans));



    }

    static int [] search ( int [][] arr, int target){
         if ( arr.length == 0){
             return new int[] {-1,-1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];

                if ( element == target){
                    return new int[] {row, col};
                }
            }
        }return new int[] {-1,-1};


    }
}
