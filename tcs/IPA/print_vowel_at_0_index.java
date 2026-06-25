/*enter a string and print all vowels as it is which is available on the string at 0 index string; Hello I am a student output: Iaa*/

package IPA;

import java.util.Scanner;

class PrintVowelAT0Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if ("AEIOUaeiou".indexOf(words[i].charAt(0)) != -1) {
                System.out.print(words[i].charAt(0));
            }

        }
    }
}