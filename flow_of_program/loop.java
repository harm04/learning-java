
//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package com.flow_of_program;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in=0;
        int sum =0;

        while (in!=4){
            System.out.print("emter the number: ");
             in = scanner.nextInt();
             sum+=in;

        }
        System.out.println(sum);

    }
}
