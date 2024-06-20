
//Input a year and find whether it is a leap year or not.
package com.flow_of_program;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("leap year");
                }
            } else {
                System.out.println("leap year");
            }
        } else {
            System.out.println("not leap year");
        }
    }
}
