package com.syntax.review1;

public class DataTypes {
    public static void main(String[] args) {

        /* Data Types in Java: 1. primitive and 2. non primitive

        Primitive data types (8): byte, short, int, long, char, float, double, boolean

        numeric:
            whole numbers: byte, short, int, long
            decimal numbers: double, float

        non-numeric:
            boolean: true or false
            char: single character

         */

        // dataType nameOfTheVariable = value;
        // data types for whole values
        byte num=127;
        short num1=10;
        int num2=1000;  // most used
        long num3=1000000;
        long num4=10000009798796985l;

        // data types for decimal values
        float number=10.99f;
        double number2=100.89;

        //data type to represent single character
        char money='$';
        char gender='m';

        // to represent yes or no
        boolean needBreak=true;
        boolean understandingJava=true;

        System.out.println(num1); //printing value inside variable num1=10
        System.out.println("num1"); //printing a String value=num1

        // create a variable and store value into it
        boolean hungry=false;
        System.out.println(hungry);




    }
}
