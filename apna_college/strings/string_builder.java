package com.apna_college.strings;

public class string_builder {
    static void main() {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));
        //set char at index
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        //insert
        sb.insert(2,'n');
        System.out.println(sb);
        //delete the extra 'n'
        sb.delete(2,3);
        System.out.println(sb);
        //append
        sb.append("y");
        System.out.println(sb);
        //print length of string
        System.out.println(sb.length());
    }
}
