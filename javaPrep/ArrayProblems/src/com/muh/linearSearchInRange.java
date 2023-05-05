package com.muh;

public class linearSearchInRange {
    public static void main(String[] args) {

        int [] a = {34, 56, 64, 52, 84, 27, 16, 23};
        int targ = 64;
        boolean ans = linearSearchinRange(a, targ);
        System.out.println(ans);



    }
    static boolean linearSearchinRange(int [] arr, int target){
        if ( arr.length == 0){
            return false;
        }

        for (int index = 2; index < 5; index++) {

            int element = arr[index];
            if (element == target){
                return true;
            }

        }return false;

    }
}
