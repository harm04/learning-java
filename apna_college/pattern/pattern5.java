package com.apna_college.pattern;

//this pattern is also known as floyd's triangle
public class pattern5 {
    static void main() {
        int count =1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
