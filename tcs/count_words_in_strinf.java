import java.util.*;

class CountWordsInStrinf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (str.charAt(i - 1) == ' ' && str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.print("the number of words in a string is : " + count);
    }
}