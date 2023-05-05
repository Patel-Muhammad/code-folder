package com.muh;

public class ArrayP2Wealth {
    public static void main(String[] args) {

        int [][] array = {
                {23, 5, 12},
                {38, 3, 9,10},
                {9, 1}
        };

        System.out.println(Richest(array));
    }

    static int Richest(int [][] arr){

        int ans = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];
            }
            if( sum > ans){
                ans = sum;
            }
        }return ans;
    }
}
