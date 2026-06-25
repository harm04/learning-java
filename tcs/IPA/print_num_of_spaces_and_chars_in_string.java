/*wap to compute the number of spaces and characters string: Hi I am a Student output: 4 13*/
package IPA;

import java.util.Scanner;


class PrintNumOfSpacesAndCharsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int spaces = 0;
        int chars=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaces++;
            }else {
                chars++;
            }
        }
        System.out.print(spaces + " " + chars);
    }
}