package com.muh;

public class SumTillN {

    public static void main(String[] args) {
        System.out.println(Sum(5));
    }

    static int Sum(int n){
        if ( n == 1) {
            return 1;
        }
        if ( n == 0){
            return 0;
        }

        return n + Sum(n-1) ;
    }
}
