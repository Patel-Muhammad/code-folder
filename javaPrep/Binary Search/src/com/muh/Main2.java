package com.muh;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = {21, 36, 44, 56, 67, 98};
        int target = 67;

        System.out.println(BinSea(arr, target));
    }

    static int BinSea(int[] arr, int target){

        int s = 0;
        int e = arr.length - 1;

        while ( s < e){

            int mid = (s+e)/2;

            if (arr[mid] == target){
                return mid;
            }


            else if( arr[mid] < target){
                //  Search left
                s = mid + 1;
            }
            else if( arr[mid] > target){
                //  Search right
                e = mid - 1;
            }
        }return -1;
    }
}
