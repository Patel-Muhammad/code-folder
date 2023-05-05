package com.muh;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0,n,i;
        Scanner in  = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        n = in.nextInt();

        if ( n == 0 || n == 1){
            System.out.println("Neither Prime Nor Composite...");
            count++;
        }

        if ( n < 0){
            n = n*(-1);
        }

        for (i = n; i > 2; i--) {
            if (n % (i-1) == 0){
                System.out.println("Number is NOT prime");
                count++;
                break;
            }

        }

        if (count == 0){
            System.out.println("Number is Prime!!");
        }

    }
}
