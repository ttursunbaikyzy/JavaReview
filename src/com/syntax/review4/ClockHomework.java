package com.syntax.review4;

public class ClockHomework {

    public static void main(String[] args) {

    /*
    Create a digital clock
    It should start printing 00:00 and end 23:59
     */

        for (int a = 0; a <= 2; a++) {
            for (int b = 0; b <= 3; b++) {
                for (int c = 0; c <= 59; c++) {
                    for (int d = 0; d <= 59; d++) {
                        System.out.println(a+""+ b + ":" + c+":"+d);
                    }
                }
            }
        }


    }
}
