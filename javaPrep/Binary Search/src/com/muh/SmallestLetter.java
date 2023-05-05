package com.muh;
//Remaining
public class SmallestLetter {
    public static void main(String[] args) {

//                       0    1    2    3    4    5    6
        char[] array = {'c', 'f', 'j', 'm', 'p', 'w', 'y'};
        char targ = 'k';
        char ans = l1(array, targ);

        System.out.println(ans);

    }
    static char l1 ( char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        int mid = ( start + end )/ 2;
        while( start < end ){

            if ( arr[mid] > target){
                end = mid -1;
            }
            else if ( arr[mid] < target){
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }return arr[start];
    }
}
