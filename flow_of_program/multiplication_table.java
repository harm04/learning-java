
//Take a number as input and print the multiplication table for it.
package com.flow_of_program;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("enter the number: ");
        int n = scanner.nextInt();

        for (int i =1;i<=10;i++){
            System.out.println(n +" x "+ i + " = "+ n*i);
        }
    }
}
