package com.muh;
import java.util.Scanner;
public class Max {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number :");
        int num1 = input.nextInt();

        System.out.print("Enter Second Number :");
        int num2 = input.nextInt();

        System.out.print("Enter Third Number :");
        int num3 = input.nextInt();

        if (num1 > num2) {
            if (num1 > num3){
                System.out.println("The Maximum Number is " + num1);
            }
            else{
                System.out.println("The Maximum Number is " + num3);
            }

        }
        else{
            if (num2 > num3){
                System.out.println("The Maximum Number is " + num2);
            }
            else{
                System.out.println("The Maximum Number is " + num3);
            }
        }


    }
}
