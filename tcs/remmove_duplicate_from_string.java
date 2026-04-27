import java.util.*;

class RemoveDuplicateFromString {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            if (result.contains(ch)) {
                continue;
            }
            result += ch;
        }
        System.out.print(result);
    }
}