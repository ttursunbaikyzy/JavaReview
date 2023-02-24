package com.syntax.review9;

public class Bank {
    public static void main(String[] args) {
        Customer c=new Customer();
        c.setName("Tami");
        System.out.println("Name of the custoner is "+c.getName());

        c.setSsn(123456789);
        System.out.println("SSN of the customer is "+c.getSsn());

        PrivateClient pc=new PrivateClient("Sam",5468764515l);
        System.out.println("Private client name "+pc.getName());
        System.out.println("Private client SSN ="+pc.getSsn());
    }
}
