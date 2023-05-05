package com.muh;
import java.sql.SQLOutput;
import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {

        System.out.print("Please Enter a Number: ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("Your number is Even ");
        }
        else if (num == 1){
            System.out.println("1 is neither Even nor Odd");
        }
        else{
            System.out.println("Your number is Odd ");
        }

    }
}
