package com.syntax.review6;

public class StrBuilderExample {
    public static void main(String[] args) {

        // this class is mutable collection of characters
        StringBuilder sb = new StringBuilder("Hello");

        // all changes happen on the same object
        sb.reverse();

        System.out.println(sb); // olleH

        String str=sb.toString(); // no more mutable
        str.toUpperCase(); // proves that String is immutable
        System.out.println(str); // olleH

    }
}
