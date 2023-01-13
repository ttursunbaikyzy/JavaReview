package com.syntax.review3;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println("************ Logical AND ***************");

        boolean loginButtonDisplayed=true;
        boolean loginButtonClickable=true;

        if (loginButtonDisplayed && loginButtonClickable) {
            System.out.println("Test case is passed");
        } else {
            System.out.println("Test case is failed");
        }

        System.out.println("************ Logical OR ***************");

        boolean dashboard = true;
        String message="Welcome admin";

        if (dashboard || message.equals("Welcome admin")) {
            System.out.println("User is logged in");
        } else {
            System.out.println("User is not logged in");
        }

        System.out.println("************ Logical NOT ***************");

        boolean b=true;

        System.out.println(!true); // false

        boolean agreeCheckboxSelected=true;

        if (!agreeCheckboxSelected){
            System.out.println("I am clicking on checkbox");
        }

        System.out.println("I am clicking on submit button");


    }
}
