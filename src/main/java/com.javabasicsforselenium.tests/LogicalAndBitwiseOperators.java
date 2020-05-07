package com.javabasicsforselenium.tests;

public class LogicalAndBitwiseOperators {
    public static void main(String[] args) {

        /*****  Logical Operators   *****/
        boolean t = true;
        boolean f = false;

        // Logical AND - &&
        System.out.println(t && f); // Output - false

        // Logical OR - ||
        System.out.println(t || f); // Output - true

        // Logical NOT - !
        System.out.println(!t); // Output - false

        /*****  Bitwise Operators   *****/
        int a = 10; //   1010
        int b = 20; //  10100
        int c = 60; // 111100           // In Binary
                                        // a        =  1010
        // Bitwise And - &              // b        = 10100
        System.out.println(a & b);      // a & b    = 00000 => 0
                                            // a        =  1010
        // Bitwise Or - |                   // b        = 10100
        System.out.println(a | b);          // a | b    = 11110 => 30

        // Bitwise Compliment - ~   // c        =  +111100
        System.out.println(~c);     // ~c       =  -000011 => -61
    }
}