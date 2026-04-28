package com.apna_college.pattern;

public class pattern2 {
    static void main() {
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
