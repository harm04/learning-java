package com.apna_college.pattern;

public class pattern8 {
    static void main() {
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
