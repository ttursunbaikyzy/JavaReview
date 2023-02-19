package com.syntax.review8;

import com.syntax.review7.Car;
import com.syntax.review7.Tesla;

public class CarTest {
    public static void main(String[] args) {
        BMW bmw = new BMW("Bmw","X7");
        bmw.start();
        System.out.println(bmw.drive("smooth"));
        bmw.brake(); // comes from BMW which is subclass

        Car car=new Car("SomeCar", "SomeModel");
        car.start();;
        car.drive(90);

        Tesla tesla=new Tesla("Tesla","S", 2022, 350, "electric", true);
        tesla.start(); // overrided method from Tesla class is executed
        tesla.drive(75); // comes from Parent class
        tesla.haveAutopilot(); // comes from Tesla class


        // Runtime polymorphism - achieved through method overriding
        // casting: widening and narrowing - used with primitives
        // upcasting and downcasting - use with non primitives
        // upcasting happens implicitly
        // downcasting happens explicitly

        Car bmw1=new BMW("Bmw","X77");  //upcasting

        bmw1.start();
        bmw1.drive(95);
        bmw1.drive("Austin",90);


    }
}
