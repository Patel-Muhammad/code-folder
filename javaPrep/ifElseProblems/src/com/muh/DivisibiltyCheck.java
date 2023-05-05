package com.muh;
import java.util.Scanner;

public class DivisibiltyCheck {
    public static void main(String[] args) {

        System.out.print("Please enter a number: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if ( num % 5 == 0 && num % 10 == 0 ){
            System.out.println("Your Number is Divisible by 5 and 10 both");
        }
        else{
            System.out.println("Your number is not Divisible by any one, or both");
        }

    }
}
