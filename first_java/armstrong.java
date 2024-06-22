
//To find Armstrong Number between two given number.
package com.first_java;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your number: ");
        int num = scanner.nextInt();
        int last = 0;
        int temp = num;
        int sum = 0;
        int count = 0;
        while (temp > 0) {


            temp = temp / 10;
            count++;

        }
        temp = num;

        for (int i = 0; i < count; i++) {
            last = num % 10;
            num = num / 10;
            sum += (int) Math.pow(last, count);

        }
        if (sum == temp) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstromg");
        }
    }
}
