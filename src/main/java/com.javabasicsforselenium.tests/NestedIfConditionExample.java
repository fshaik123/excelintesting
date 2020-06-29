package com.javabasicsforselenium.tests;

public class NestedIfConditionExample {
    public static void main(String[] args) {
        /* Student Grades will be the best example for nested if
         * Marks > 90 then A grade
         * Marks > 75 then B grade
         * Marks > 60 then C grade
         * Marks > 35 then D grade
         * Marks < 35 then fail
         */
        int marks = 86;

        // Nested If Condition example
        if (marks > 90) {                   // Since this condition is not true, it will go to else part
            System.out.println("A Grade");
        } else if (marks > 75) {            // Since this condition is satisfied, output will be printed as B Grade
            System.out.println("B Grade");
        } else if (marks > 60) {
            System.out.println("C Grade");
        } else if (marks > 35) {
            System.out.println("D Grade");
        } else {
            System.out.println("Fail");
        }
    }
}