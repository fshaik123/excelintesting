package com.javabasicsforselenium.tests;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 2;
        // To check whether they are Equal
        if (a == b) {
            System.out.println("Equal");
        }
        // To check whether they are Not Equal
        if (a != b) {                                   // Nested If Statement
            System.out.println("Not Equal");
            if (a == c) {
                System.out.println("a & c are equal");
            }
        }
        // Greater than
        if (a > b) {
            System.out.println("Greater than");
        }
        // Less than
        else if (a < b) {
            System.out.println("Less than");
        }
        // Greater than or Equal To
        if (a >= b) {
            System.out.println("Greater than or Equal To");
        }
        // Less than or Equal To
        if (a <= b) {
            System.out.println("Less than or Equal To");
        } else {
            System.out.println("Covered If else condition also in these");
        }
    }
}
