package com.syntax.review8;

public class InsuranceTest {
    public static void main(String[] args) {
        // can I create and object of Insurance Class - NO, since it's abstract
        Insurance carPolicy=new CarPolicy("I65456","John Smith",200,22);

        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());

        Insurance petPolicy=new PetPolicy("P265531","Sam",20,4);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());

        Insurance[] insurances={
                new CarPolicy("P2634666431","Sam",200,25),
                new CarPolicy("P2umut31","Sammi",250,4),
                new PetPolicy("P26mtmut","Tami",75,18),
                new CarPolicy("P26umyuuyuiu,31","Tamie",300,22),
        };

        insurances[0].calculateCoverage();
    }
}
