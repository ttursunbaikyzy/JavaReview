package com.syntax.review6;

public class StringMethods {
    public static void main(String[] args) {

        String str="Hello";

        System.out.println(str.length()); // 5
        System.out.println(str.toUpperCase()); // HELLO
        System.out.println(str.charAt(1)); // to access letter e

        String newStr=str.concat(" friends");
        System.out.println(newStr); // Hello friends
        System.out.println(str); // Hello

        str=str.toLowerCase(); // reassigned value
        System.out.println(str); // hello

        boolean empty=str.isEmpty();
        System.out.println(empty);

        String str1="   Review B15   ";
        str1.trim();

    }
}
