//anagram are the strings that have same character with the same frequencies

import java.util.*;

class Anagram {
    public static void main(String[] args) {
        System.out.print("Enter first string: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        if (str1.length() != str2.length()) {
            System.out.print("Not anagram");

        } else {
            char ch1[] = str1.toCharArray();
            Arrays.sort(ch1);
            char ch2[] = str2.toCharArray();
            Arrays.sort(ch2);

            if (Arrays.equals(ch1, ch2)) {
                System.out.print("Anagram");
            } else {
                System.out.print("Not anagram");
            }
        }
    }
}