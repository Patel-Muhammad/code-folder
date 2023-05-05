package com.muh;

public class ProDigits {
    public static void main(String[] args) {

        System.out.println(digiProd(98));
    }
    static int digiProd(int n){
        if ( n%10 == n ){
            return n;
        }

        return n = (n % 10) * digiProd(n / 10);
    }
}
