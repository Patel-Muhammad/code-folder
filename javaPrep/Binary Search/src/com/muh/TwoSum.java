package com.muh;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 7, 4, 8};
        int target = 10;

        int[] twosum = sum(arr,target);

        System.out.println(Arrays.toString(twosum));
    }
    static int[] sum ( int[] arr, int target){
        int[] ans = { -1 , -1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 ; j < arr.length && j!=i ; j++) {


                if( arr[i] + arr[j] == target){
                    ans = new int[]{j, i};
                    return ans;
                }
            }
        }
        return ans;
    }
}
