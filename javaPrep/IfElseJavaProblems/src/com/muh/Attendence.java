package com.muh;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Attendence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the total number of classes held: ");
        float totalClasses = in.nextFloat();

        System.out.print("Please enter the total number of classes you attended: ");
        float attendedClasses = in.nextFloat();

        float ap = ( attendedClasses / totalClasses) * 100 ;
        System.out.println("Your attendance percentage is " + ap +"%");

        if ( ap >= 75 ){
            System.out.println("You are allowed to appear for exams");
        }
        else{
            System.out.println("You are not allowed to appear for exams");
        }
    }
}
