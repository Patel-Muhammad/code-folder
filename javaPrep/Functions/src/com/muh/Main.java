package com.muh;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter value of a : ");
        int A = in.nextInt();
        System.out.println("Enter value of b : ");
        int B = in.nextInt();

        swap(A,B);



    }

    static void swap(int a, int b){

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a );
        System.out.println("b = " + b );
    }
}
