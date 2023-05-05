package com.muh;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SalaryIncrement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Congrats!! You are a very hardworking Employee, the festive season your are given 5% bonous");

        System.out.print("Please enter the number of years of your service in the company: ");
        int syr = in.nextInt();

        if( syr >= 5 ){
            System.out.println("You are eligible for the Bonous!");

            System.out.print("Please enter your Current Salary: ");
            int salary = in.nextInt();

            System.out.println("Your Current Salary: " + salary);
            int bonous = ( salary * 5 ) / 100;

            System.out.println("You are given a bonous of " + bonous +"₹");

        }
        else{
            System.out.println("We are soryy, you cannot get Bonous if your years of sevice are less than 5");
        }


    }
}
