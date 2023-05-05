package com.muh;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of what you want table of: ");
        int a = in.nextInt();

        for ( int t = 1; t <= 10; t++ ){
            System.out.println( a + " * "+ t  + " = " + t * a);
        }
    }
}
