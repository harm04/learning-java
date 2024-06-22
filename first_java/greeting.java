//Take name as input and print a greeting message for that particular name.

package com.first_java;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("hello " + name.toUpperCase());
    }
}
