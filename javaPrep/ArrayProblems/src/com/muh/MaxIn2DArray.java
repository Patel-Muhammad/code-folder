package com.muh;

import java.util.Arrays;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int [][] array = {
                {12, 54, 9},
                {8, 34, 99, 10,108},
                {94, 320},
                {65},
        };

        int ans = max2d(array);

        System.out.println(ans);


    }

    static int max2d( int[][] arr){
        int max = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }

            }
        }
        return max;
    }
}
