package com.muh;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int[] a = {84, 93, 75, 94, 26, 74 ,75 ,73 ,34, 65, 27,73, 94, 48, 93,71, 02, 99, 33, 55, 12};
        System.out.println(Arrays.toString(a));
        System.out.print("Enter the Number you want to search in the Array: ");
        int input = sc.nextInt();

        int ans = linearSearch1(a, input);


        if ( ans == -1){
            System.out.println("Sorry, your Entered Number does not exist in the Array");
        }
        else{
            int newans = ans + 1;
            System.out.println("Your Entered number is at " + newans + " place" );
        }


    }
    static int linearSearch1 ( int[] arr, int target){

        for ( int index = 0; index < arr.length; index++){
            int element = arr[index];

            if ( element == target){
                return index;
            }
        }return -1;
    }
}
