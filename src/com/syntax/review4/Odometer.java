package com.syntax.review4;

public class Odometer {
    public static void main(String[] args) {

        /* incorrect practice:
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(i+" ");

            }
            System.out.println();
        }*/

        System.out.println("*****************");

        for (int a = 0; a <= 9 ; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9 ; c++) {
                    for (int d = 0; d <= 9; d++) {
                        System.out.println(a+" "+b+" "+c+" "+d+" ");
                    }
                }
            }
        }


    }
}
