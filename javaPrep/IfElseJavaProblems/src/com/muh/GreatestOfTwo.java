package com.muh;
import java.util.Scanner;


public class GreatestOfTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        if( a > b){
            System.out.println( a +" is the greatest of two");
        }
        else{
            System.out.println( b +" is the greatest of two");
        }

    }
}
