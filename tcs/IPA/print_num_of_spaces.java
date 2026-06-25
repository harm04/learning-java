/*wap to print the number of spaces in particular string string: Hello what is your name output: 4 condition: if the count is greater than or equal to 3 then print the count else print NA as it is.*/
package IPA;

import java.util.Scanner;


class PrintNumOfSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        if (count >= 3) {
            System.out.println(count);
        } else {
            System.out.println("NA");
        }
    }
}