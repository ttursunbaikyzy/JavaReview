package com.syntax.review9;
// collection of public static variables and public abstract
public interface Drawable {
    String TOOL="Pencil"; // by default: public static final  (we write in CAPS)
    void draw(); // by default this method is public abstract

    // above is how Interface used to be before java 8
    // after Java 8 statiic and default methods were added to the interface

    default void print(){
        System.out.println("We are drawing object using "+TOOL);
    }
    static void erase(){
        System.out.println("All drawing are erasable");
    }
}
abstract class Shape {
    public String color;
    protected double width, length;
    Shape(String color, double width, double length){
        this.color=color;
        this.width=width;
        this.length=length;
    }
    public abstract double calculateArea();
}
class Rectangle extends Shape implements Drawable {

    Rectangle(String color, double width, double length){
        super(color, width, length);
    }
    public double calculateArea(){
        return length*width;
    }
    @Override
    public void draw(){
        System.out.println("I am drawing rectangle");
    }

}
class Square implements Drawable{
    @Override
    public void draw() {
        System.out.println("I am drawing square");
    }
}