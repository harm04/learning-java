
//Take 2 numbers as inputs and find their HCF and LCM.


/*
What is HCF and LCM?

The Highest Common Factor (HCF) of two or more numbers is the largest number that divides each of them exactly. The Lowest Common Multiple (LCM) of two or more numbers is the smallest of the common multiples of those numbers.

How to Find HCF and LCM?

There are two main methods to find HCF and LCM:

Prime Factorization Method: This method involves finding the prime factors of each number and then identifying the common factors.
Division Method: This method involves dividing the larger number by the smaller number and finding the remainder. The HCF is the largest number that divides both numbers without leaving a remainder.
HCF Formula

The HCF of two or more numbers can be calculated using the formula:

HCF (a, b) = Product of the smallest power of each common prime factor

LCM Formula

The LCM of two or more numbers can be calculated using the formula:

LCM (a, b) = Product of the greatest power of each prime factor

Examples

HCF of 24 and 36 = 12 (because 12 is the largest number that divides both 24 and 36 exactly)
LCM of 8 and 16 = 16 (because 16 is the smallest number that is a common multiple of 8 and 16)
Properties of HCF and LCM

HCF is always less than or equal to the smaller of the two numbers.
LCM is always greater than or equal to the larger of the two numbers.
HCF and LCM are related to each other: HCF × LCM = Product of the two numbers.
*/


package com.flow_of_program;

import java.util.Scanner;

public class hcf_lcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the smallest number: ");
        int a = scanner.nextInt();
        System.out.print("enter the greatest number: ");
        int b = scanner.nextInt();

        int x = b;
        int y = a;
        int hcf = 0;
        int lcm = 0;

        while (x % y != 0) {
            y = x % y;

        }
        hcf = y;
        lcm = a * (x / y);

        System.out.println(hcf);
        System.out.println(lcm);


    }
}
