package com.syntax.review3;

public class ForLoops {
    public static void main(String[] args) {

        /*
        1. initialization
        2. condition
        3. if true -> code goes inside the loop body
        boes back, increment
        repeat
         */

        for (int i=1; i<=5; i++) {
            System.out.println("Hello "+i);
        }

        System.out.println("*************************");

        for (int a=0; a<3; a+=4) {
            System.out.println("Bye");
        }


        System.out.println("*************************");

        for (int i=2; i>10; i++){
            System.out.println(i);
        }

        System.out.println("*************************");

        for (int j=3; j<10; j--){
            System.out.println(j);
        }

    }
}
