package com.javabasicsforselenium.tests;

public class ArithmeticOperatorsInJava {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int num3 = 4;

        int resAdd = num1 + num2 + num3; // Addition

        int resSub = num2 - num1; // Substraction

        int resMul = num1 * num2; // Multiplication

        int resDiv = num3 / num1; // Division

        int resMod = num3 % num1; // Modulus

        int resInc = num1++; // Increment by 1
        //  or
        num1 = num1 + 1;

        int resDec = num1--; // Decrement by 1
        //  or
        num1 = num1 - 1;

        num1 += 3; // Increment by any number
        //  or
        num1 = num1 + 3;

        num1 -= 7; // Decrement by any number
        //  or
        num1 = num1 - 7;

        num2 *= 2; // Multiplication by any value
        //  or
        num2 = num2 * 2;

        num3 /= 4; // Division by any value
        //  or
        num3 = num3 / 4;
    }
}