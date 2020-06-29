package com.javabasicsforselenium.tests;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int a = 30;
        // If we use Do while, the statements are executed atleast
        // once even though the condition is false
        do {
            a -= 2;
            System.out.println(a);
        } while (a > 30);
    }
}