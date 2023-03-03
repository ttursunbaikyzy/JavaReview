package com.syntax.review10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        // set is a collection of unique elements
        Set<String> qaJobs = new HashSet<>();

        // adding objects/elements to the collection
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("API Tester");
        qaJobs.add("Database Tester");
        System.out.println(qaJobs);

        qaJobs.remove("Manual Tester");
        System.out.println("Removed an element "+qaJobs);

        qaJobs.add("API Tester");
        qaJobs.add("API Tester");
        System.out.println("Added duplicates = "+qaJobs);

        // creating an Object and passing collection as a parameter
        // to invoke parametirized contrustor
        Set<String> lset=new LinkedHashSet<>(qaJobs); // maintains the insertion order
        System.out.println("LinkedHashSet ="+lset);

        Set<String> tset=new TreeSet<>(qaJobs);
        tset.addAll(qaJobs);
        System.out.println("TreeSet ="+tset);

    }
}
