
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package com.first_java;

import java.util.Scanner;

public class simple_intrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter principal amount: ");
        float p = scanner.nextFloat();
        System.out.print("enter rate of intrest: ");
        float i = scanner.nextFloat();
        System.out.print("enter time: ");
        float t = scanner.nextFloat();
        System.out.println("your simple intrest is " + (i * p * t) / 100 + " Rs");
    }
}
