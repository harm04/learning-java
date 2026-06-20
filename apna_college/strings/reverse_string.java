package com.apna_college.strings;
//reverse a string using string builder
public class reverse_string {
    static void main() {
        StringBuilder sb=new StringBuilder();
        String str="hello";
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
