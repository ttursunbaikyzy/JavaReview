package com.syntax.review6;

public class Flower {

    // attributes, properties

    String color, name;
    int price;
    static boolean pretty=true; // static can only be declared in class, not method

    void smell () {
        System.out.println(name+"smell good");
    }

    void bloom () {
        System.out.println(name+"  flower blooms");
    }

    void grow(){
        System.out.println(name+" flower grows");
    }




}
