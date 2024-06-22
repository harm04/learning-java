
//Take 2 numbers as input and print the largest number.
package com.first_java;

import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter 1st number:");
        int first = scanner.nextInt();
        System.out.print("enter 2nd number:");
        int second = scanner.nextInt();

        if(first>second){
            System.out.print("first is greater");
        } else{
            System.out.print("second number is greater");
        }
    }
}
