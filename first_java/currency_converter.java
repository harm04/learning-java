
//Input currency in rupees and output in USD.
package com.first_java;

import java.util.Scanner;

public class currency_converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter amount in Rs: ");
        float amount = scanner.nextFloat();
        System.out.print("amount in USD is: " + 0.012 * amount);
    }
}
