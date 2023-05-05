package com.muh;

public class orderAgnosticBS {
    public static void main(String[] args) {
//                      0   1   2   3   4   5   6   7
        int[] array = {11, 23, 35, 41, 58, 64, 78, 90};

        int targ = 23;

        int ans = orderAgnosticbs(array, targ);

        System.out.println(ans);
    }
    static int orderAgnosticbs (int[] arr, int target){
        int start = 0;
        int end = arr.length -1 ;

        while( start <= end ){
            int mid = (start + end) / 2;

            int lastEntryIndex = arr.length - 1;
            if ( arr[0] - arr[lastEntryIndex] < 0){

                if( arr[mid] > target ){
                    end = mid - 1;
                }
                else if ( arr[mid] < target ){
                    start = mid + 1;
                }
                else{
                    return mid;
                }

            }
            if (arr[0] - arr[lastEntryIndex] > 0){
                if ( arr[mid] > target){
                    start = mid + 1;
                }
                else if ( arr[mid] < target){
                    end = mid - 1;
                }
                else {
                    return mid;
                }
            }
            if (arr[0] == arr[lastEntryIndex]){
                return arr[0];
            }

        }return -1;

    }
}
