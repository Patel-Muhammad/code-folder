package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);

        // Taking Input
        System.out.println("Enter two Numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        //Before Swapping
        System.out.println("Before Swapping : ");
        System.out.println("a = " +a  +"\nb = " +b  );

        //Swapping
        int temp = a;
        a = b;
        b = temp;

        //After Swapping
        System.out.println("After Swapping : ");
        System.out.println("a = " +a  +"\nb = " +b  );








        }
    }
