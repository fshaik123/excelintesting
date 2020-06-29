package com.javabasicsforselenium.tests;

public class ForLoopExample {
    public static void main(String[] args) {
        // for loop is used to execute a set of statements multiple times
        for (int i = 0; i <= 10; i++) {      // for loop starts with i=0;
            System.out.println(i);          // i increments by 1 based on the condition given i++
        }                                   // then verifies the condition i <= 10 and if condition is true,
        // statement in 'for' block will be executed

        // Another Example
        /* Find the fibonacci series for the first 10 numbers
         * 0 1 1 2 3 5 8 13 21 34
         */
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + "\t");           // \t will help you get all the values in a single line with a tab space b/w them
        System.out.print(n2 + "\t");
        for (int j = 1; j <= 8; j++) {             // Here we are using j=8 because we are getting fibonacci series
            n3 = n1 + n2;                           // for first 10 numbers and we have already printed two numbers above
            System.out.print(n3 + "\t");
            n1 = n2;
            n2 = n3;
        }
    }
}
