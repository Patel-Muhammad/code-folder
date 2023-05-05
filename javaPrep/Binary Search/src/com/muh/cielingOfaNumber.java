package com.muh;

public class cielingOfaNumber {
    public static void main(String[] args) {

//                      0   1   2   3   4   5   6   7
        int[] array = {11, 23, 35, 41, 58, 64, 78, 90};
        int targ = 41;
        int ans = cielingOf(array, targ);

        System.out.println(ans);

    }

    static int cielingOf(int[] arr, int target) {
        //smallest number >= target
        int start = 0;
        int end = arr.length - 1;

        if ( target > arr[arr.length - 1 ]){
            return -1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
