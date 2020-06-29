package com.javabasicsforselenium.tests;

public class NestedForLoopExample {
    public static void main(String[] args) {
        // for loop is used to execute a set of statements multiple times
        for (int i = 1; i <= 5; i++) {      // for loop starts with i=1;

            for (int j = 1; j <= 3; j++) {             // This is known as Nested For loop since we are
                // using one for loop in another
                System.out.println(i + "," + j);
            }
            System.out.println("All iterations of J are complete for specific I value");
        }
        System.out.println("All iterations of I are complete");

        // Another Example
        /*
         *      Write a program to create the pattern
         *
         *      *
         *      **
         *      ***
         *      ****
         *      *****
         *
         */
        for (int m = 1; m <= 5; m++) {
            for (int n = 1; n <= m; n++) {
                System.out.print("*");
            }
            System.out.print("\n");           // for new line
        }
    }
}
