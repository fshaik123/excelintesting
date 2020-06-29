package com.javabasicsforselenium.tests;

public class IfConditionExample {
    public static void main(String[] args) {
        int A = 25;
        int B = 30;

        // If Condition example
        // Syntax - if (condition) { statements; }
        if (A < B) {
            System.out.println("A is less than B. Hence If Condition passed"); // Output is displayed in the console
        }

        // If - else example
        if (A == B) {
            System.out.println("A is equal to B"); // Since the condition given in if is not true,
            // the statement present in 'if' is not executed
        } else {
            System.out.println("A and B are not equal"); //Since if condition is not satisfied and else do not have any condition,
            // the statements present in 'else' will be executed
        }
    }
}