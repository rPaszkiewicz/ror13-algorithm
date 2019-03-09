package com.justRandomStuff;

import static java.lang.System.out;

public class Palindrome {

    public Palindrome(){

    }
    public static void palindromeCheck(String word){
        String reversed="";
        for (int i = word.length()-1; i>=0; i--)
            reversed+=word.toCharArray()[i];
        if (word.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not");
    }
}
