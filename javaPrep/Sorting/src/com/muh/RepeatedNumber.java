package com.muh;

public class RepeatedNumber {
    public static void main(String[] args) {

        //            0  1  2  3  4
        int[] arr = { 1, 3, 2, 4, 6, 5, 5};

        System.out.println(repeted(arr));
    }

    static int repeted (int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;

            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if( arr[index] != index + 1){
                return arr[index];
            }
        }
        return arr.length;
    }

    static  void swap (int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =temp;

    }
}
