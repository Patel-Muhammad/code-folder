package com.muh;
import java.util.Scanner;


public class SquareCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the Length: ");
        int lh = input.nextInt();

        System.out.print("Please enter the Breadth: ");
        int bh = input.nextInt();

        if ( lh == bh ){
            System.out.println("This is a Square");
        }
        else{
            System.out.println("This is not a Square");
        }



    }
}
