package com.syntax.review6;

public class Garden {

    void hello () {
        String name="Adem";
        System.out.println("Hello "+name);
    }
    public static void main(String[] args) {
        // static String str; error because this is a local variable within main method and cannot be static

        /*
        This code creates an object of the class "Flower" and assigns it to the variable "flower1".
        The "new" keyword is used to create an instance of an object in Java. In this line, the constructor of the "Flower"
        class is being called to create a new object, and that object is being assigned to the variable "flower1".
         */

        // System.out.println(name); local variable to hello method

        System.out.println(Flower.pretty); //correct way accessing static variable by the class name
        // accessing variables of Flower class
        Flower flower1=new Flower();
        flower1.name="Hibiscus";
        flower1.color="red";
        flower1.price=5;
        flower1.pretty=false; // not the right way to access static variable but it is possible
        // the above line will change to false for all because pretty is a static variable
        // flower1.size=  error - since variables size doesn't exist in flower class
        System.out.println("Hibiscus are pretty? "+flower1.pretty); // static can be accessed by variable but not the right way

        // accessing methods of Flower class
        flower1.bloom();
        flower1.grow();
        flower1.smell();

        System.out.println("Creating second object of the flower class");
        Flower flower2=new Flower();
        flower2.name="Rose";
        flower2.color="blue";
        flower2.price=15;
        flower2.price=18;
        System.out.println(flower2.price);
        System.out.println("Roses are pretty? "+flower1.pretty);

        flower2.bloom();
        flower2.grow();
        flower2.smell();
        // flower2.stinks=  error - since method is not defined in flower class

        System.out.println("Creating third object of the flower class");
        Flower flower3=new Flower();
        flower3.name="";
        flower3.color="";
        flower3.price=15;

        flower3.bloom();
        flower3.grow();
        flower3.smell();

        // i is a local variable inside the loop {}
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        // System.out.println(i); error - since i is not visible outside of loop {}


    }
}
