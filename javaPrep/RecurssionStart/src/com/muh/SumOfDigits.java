package com.muh;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println(digiSum(65));
    }

    static int digiSum(int n){

if ( n % 10 == n){
            return n ;
        }

        return n = (n % 10) + digiSum(n/10);
    }
}
