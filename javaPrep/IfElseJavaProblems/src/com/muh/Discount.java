package com.muh;
import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the amount of purchase: ");
        int cost = in.nextInt();

        if( cost > 1000 ){
            cost = cost - (cost * 10) / 100;
            System.out.println("The amount you pay is " + cost);
        }
        else{
            System.out.println("You get no discount, so you pay " + cost);
        }
    }
}
