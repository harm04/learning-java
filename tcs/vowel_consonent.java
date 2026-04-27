
import java.util.*;

class VowelConsonent {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        int vowel = 0, consonent = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
                        || str.charAt(i) == 'U') {
                    vowel++;
                } else {
                    consonent++;
                }
            }
        }
        System.err.print("Vowel: " + vowel + " Consonent: " + consonent);
    }
}
