
//Write a program to print whether a number is even or odd, also take input from the user.
package com.first_java;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("emter number: ");
        int num = scanner.nextInt();

        if(num%2==0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
    }
}
