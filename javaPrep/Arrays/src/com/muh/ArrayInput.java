package com.muh;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Input type 1
        int[] arr = new int[5];
//
//        arr [0] = 12;
//        arr [1] = 98;
//        arr [2] = 45;
//        arr [3] = 35;
//        arr [4] = 53;
//
//        System.out.println(arr[4]);


        //Input type 2
        //Using Loops


        for ( int i = 0; i < arr.length; i++ ){

            arr[i] = in.nextInt();

        }

        System.out.println( "{" + arr[0] + ", " + arr[1] + ", " + arr[2] + ", "+ arr[3] + ", "+ arr[4] + "}");

        // Second way of printing:

        System.out.print("{ ");
        for( int i = 0; i < arr.length; i++){
            System.out.print( arr[i]+ ", ");

        }
        System.out.println("}");


        //Third way of printing:
        // Arrays.toString method

        System.out.println(Arrays.toString(arr));



    }
}
