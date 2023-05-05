package com.muh;

public class Main {
    public static void main(String[] args) {
        //             0    1   2   3   4   5
        int[] array = {11, 23, 34, 48, 53, 66};
        int ans = binarySearch(array, 15);
        System.out.println(ans);
    }

    static int binarySearch (int[] array, int target){

        int start = 0;
        int end = array.length - 1;

        while (start <= end ){

            int mid = (start + end) / 2;
            if( array[mid] < target){
                start = mid + 1;
            }
            else if( array[mid] > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
