package com.syntax.review12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedVsUnchecked {
    public static void main(String[] args) {

        /*
        Exceptions can occur because of two main reasons:
        1) the mistake of programmer
        2) external resources on which your program is dependent

        when exceptions occurs because of human error or can be avoided by simply writing good code
        and may if else conditions they are called unchecked exceptions.

         */
        System.out.println(10/0);

        // below is an example of checked exception
        // even if code is correct, might get errors
        try {
            FileInputStream fileInputStream=new FileInputStream("Files/Book2.xlsx");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        FileNotFoundException e=new FileNotFoundException();


    }
}
