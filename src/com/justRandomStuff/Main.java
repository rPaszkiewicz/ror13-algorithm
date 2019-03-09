package com.justRandomStuff;

public class Main {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{

       String string = "AB";
       String encrypted = "";

       for (int i=0; i<=string.length()-1; i++) {
           encrypted += string.codePointAt(i) + 13;
           int codePoint = Integer.parseInt(encrypted.substring(0,string.length()));
           char[] ch = Character.toChars(codePoint);                                // is this variable needed ?

           for (char c : ch)                                                        // Character.toChars can be written here
               System.out.println(c);
       }

    }

}
