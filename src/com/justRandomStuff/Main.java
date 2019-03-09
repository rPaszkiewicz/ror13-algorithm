package com.justRandomStuff;

public class Main {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{

       String string = "AB";
       String encrypted = "";

       for (int i=0; i<=string.length()-1; i++) {
           encrypted += string.codePointAt(i) + 13;

       }
       int codePoint = Integer.parseInt(encrypted.substring(0,2));
       int codePoint1 = Integer.parseInt((encrypted.substring(2,4)));
        System.out.println(encrypted);
        for (char c : Character.toChars(codePoint))
            System.out.println(c);
        for (char c : Character.toChars(codePoint1))
            System.out.println(c);

    }

}
