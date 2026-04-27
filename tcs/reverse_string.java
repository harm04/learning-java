import java.util.*;

class ReverseString {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);

        }
        System.out.println(rev);
    }
}