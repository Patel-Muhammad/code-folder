package com.muh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       //            0  1  2  3   4  5   6   7   8   9
        int[] arr = {1, 2, 3, 4, 5,6, 7, 8, 9};
        int target = 7;
        //           potential ans = {}

        System.out.println(Arrays.toString(twoSum( arr, target)));
    }


    static int[] twoSum(int[] arr, int target) {

        int[] ans = { -1 , -1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length && j!=i ; j++) {


                if( arr[i] + arr[j] == target){
                    ans = new int[]{j, i};
                    return ans;
                }
            }
        }
        return ans;
    }
}
