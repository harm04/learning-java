
//To calculate Fibonacci Series up to n numbers.
package com.first_java;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number:");
        int n = scanner.nextInt();

        int x = 0;
        int y = 1;
        int z = 0;
        System.out.print("0,1,");
        for (int i = 0; i < n - 2; i++) {
            z = x + y;
            System.out.print(z + ",");
            x = y;
            y = z;
        }
    }
}
