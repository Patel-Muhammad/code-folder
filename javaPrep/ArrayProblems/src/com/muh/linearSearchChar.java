package com.muh;

public class linearSearchChar {
    public static void main(String[] args) {

       String name = "Muhammad";
       char targ = 'd';

       boolean ans = linearSearchChar(name, targ);
        System.out.println(ans);

    }

    static boolean linearSearchChar(String str , char target ){
        if (str.length() == 0 ){
            System.out.println(false);
        }

        for (int i = 0; i < str.length(); i++) {

            char att = str.charAt(i);

            if ( att == target){
                return true;
            }

        }return false;
    }
}
