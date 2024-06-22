
//To find out whether the given String is Palindrome or not.
package com.first_java;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your string: ");
        String s = scanner.next();
        String r="";

        for(int i=s.length()-1;i>=0;i--){
            r=r+s.charAt(i);

        }

        if(s.equals(r)){
            System.out.println("palindrome");
        } else{
            System.out.println("not palindrome");
        }

//        for (int i = 0; i < s.length() / 2; i++) {
//            if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
//
//                return;
//
//            } else {
//                System.out.println("not palindrome");
//            }
//            System.out.println("palindrome");
//
//        }


    }
}
