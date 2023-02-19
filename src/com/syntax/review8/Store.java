package com.syntax.review8;

public class Store {
    public static void main(String[] args) {
        /*
        Polymorphism allows us to perform same action in different ways.
        There are two types of Polymorphism:
        early binding or compile time and time runtime or late binding.
         */

        Furniture table = new Table();
        table.assemble();
        table.comfort(); // runtime polymorphism

        Table t=new Table();
        t.assemble();
        t.comfort();
        t.buildTable("Wood"); // compile time polymorphism

        Chair.breaks();
        Furniture.breaks(); // static method called by using class name

        Furniture chair =new Chair();
        chair.assemble();
        chair.comfort(); // runtime polymorphism

        // proof that method breaks is not overriden
        chair.breaks(); // since we are not overriding methods breaks will be executed from Parent
                            // method is hidden from a child class
                            // this is also not the right way to call static method
    }
}
