/*find the largest word from the given sentence input: TCS is the best company ever output: company*/

package IPA;

import java.util.Scanner;

class LargestWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        String largest = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > largest.length()) {
                largest = words[i];
            }
        }
        System.out.println(largest);
    }
}