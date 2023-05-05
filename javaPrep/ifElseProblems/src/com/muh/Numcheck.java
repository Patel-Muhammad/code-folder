package com.muh;
import java.util.Scanner;

public class Numcheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a Number: ");

        int num = input.nextInt();

        if (num > 1){
            System.out.println(num + " is a positive int");
        }
        else if (num < 1){
            System.out.println(num + " is a negative int");
        }
        else{
            System.out.println("The input value is zero");
        }

    }
}
