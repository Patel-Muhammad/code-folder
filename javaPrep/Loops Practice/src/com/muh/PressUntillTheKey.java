package com.muh;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PressUntillTheKey {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int i = in.nextInt();

        while (i != 9){
            System.out.println("Please enter 9");
            System.out.print("Enter here: ");
            int n = in.nextInt();
            while( n == 9 ){
                i = n;
                break;
            }

        } System.out.println("Good!");

    }

}
