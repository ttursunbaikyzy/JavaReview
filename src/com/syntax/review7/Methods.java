package com.syntax.review7;

public class Methods {

    // user defined methods: with return type and without
    //                       with parameters and without
    void hello(){
        System.out.println("Hello");
    }

    void sayHello(String name){
        System.out.println("Hello "+name);
    }

    // create a method that returns the largest number between given 2 integer values
    int findLargest (int num1, int num2){
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

    // create a method that returns an average value of 2 decimal values
    double findAverage (double num1, double num2){
        return ((num1+num2)/2);
    }

    // returns reverse String from a given String
    protected String reverseString (String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
    /* if StringBuilder:
    StringBuilder reverseString (String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse();
    }*/

    // create a method that will return a min value from given array
    public static int minimum (int[] arr){ //static method belongs to the class rather than tan instance
                                            //should be accessed in a static way
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<i){
                min=arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        String name="Mohammed";

        int characters=name.length();
        System.out.println(characters);

        Methods obj=new Methods();
        obj.sayHello(name);

        int largest=obj.findLargest(100,200);
        System.out.println("The largest number is "+largest);

        System.out.println(obj.findAverage(10,30));

        System.out.println(obj.reverseString("hello"));

        String myString="Batch15";
        boolean empty=myString.toUpperCase().isEmpty(); //false

        char character=myString.trim().charAt(2); // t
        System.out.println(character);

        int[] arr={10,49,89,99};
        Methods.minimum(arr);
        int min=minimum(arr);
        System.out.println("Min number = "+min);

    }

}
