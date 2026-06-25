/*wap to print the last character of every word in string conditions: ignore all the white spaces and digits string: Hey3 Java Learners output: as*/
package IPA;

import java.util.Scanner;

class PrintLastCharOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            int index = words[i].length() - 1;
            if (!Character.isDigit(words[i].charAt(index))) {
                System.out.print(words[i].charAt(index));
            }
        }
    }
}