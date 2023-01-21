package com.syntax.review4;

public class MoreLoops {
    public static void main(String[] args) {

        // what is the output?
        for (int i =0; i <=3 ; i++) {
            System.out.println(i);
            for (int j =1; j >=3 ; j++) {
                System.out.print(j);
            }
        }

        System.out.println("**************");

        for (int i = 0; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("**************");




    }
}
