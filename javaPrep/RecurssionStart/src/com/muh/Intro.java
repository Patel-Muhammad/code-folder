package com.muh;

public class Intro {

    public static void main(String[] args) {

        print(1);
    }

    static void print(int n){
        if(n==200){
            return;
        }
        System.out.println(n);

        print(n+1);

    }
}
