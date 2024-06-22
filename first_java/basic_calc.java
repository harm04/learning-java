
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package com.first_java;

import java.util.Scanner;

public class basic_calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter 1st number:");
        int first = scanner.nextInt();
        System.out.print("enter 2nd number:");
        int second = scanner.nextInt();
        System.out.print("enter operator:");
        char op = scanner.next().charAt(0);
        float result = 0;
        if (op == '+') {
            result = first + second;
        } else if (op == '-') {
            result = first - second;
        } else if (op == '*') {
            result = first * second;
        } else if (op == '/') {
            result = (float) (first / second);
        }

        System.out.print("answer: " + result);
    }
}
