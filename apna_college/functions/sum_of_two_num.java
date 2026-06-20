package com.apna_college.functions;

import java.util.Scanner;

public class sum_of_two_num {
    public static int calSum(int a, int b){
        int sum=a+b;
        return sum;
    }
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter number one: ");
        int num1=sc.nextInt();
        System.out.print("enter number two: ");
        int num2=sc.nextInt();
        System.out.print("sum: "+calSum(num1,num2));
    }
}
