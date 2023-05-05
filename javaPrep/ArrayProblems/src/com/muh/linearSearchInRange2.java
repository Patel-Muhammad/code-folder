package com.muh;

public class linearSearchInRange2 {
    public static void main(String[] args) {

        int[] a = {84, 93, 75, 94, 26, 74 ,75 ,73 ,34, 65, 27,73, 94, 48, 93,71, 02, 99, 33, 55, 12};

        int targ = 26;

        int ans = lineaSearchInRange2(a,targ);

        System.out.println(ans);

    }
    static int lineaSearchInRange2( int[] arr, int target ){
        if ( arr.length == 0 ){
            return -1;
        }

        for (int index = 3; index < 5; index++) {
            int element = arr[index];

            if(element == target){
                return arr[index];
            }
        }return -1;
    }
}
