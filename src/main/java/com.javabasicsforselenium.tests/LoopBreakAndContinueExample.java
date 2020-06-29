package com.javabasicsforselenium.tests;

public class LoopBreakAndContinueExample {
    public static void main(String[] args) {
        // break is used to come out of the loop whenever a condition is met
        for (int a = 1; a < 6; a++) {
            if (a == 3) {
                break;                  // This will stop the loop once the if condition is met (i.e., if a=3)
            }
            System.out.println(a);
        }

        // continue will skip the loop statements for that iteration whenever a condition is met
        for (int b = 20; b < 25; b++) {
            if (b == 22) {
                continue;                // This will continue the loop with an exclusion of b=22
            }                           // i.e., the statements below the continue are not executed for the current iteration
            System.out.println(b);
        }
    }
}
