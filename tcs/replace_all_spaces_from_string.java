import java.util.*;

class ReplaceAllSpacesFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string:");
        String str = sc.nextLine();
        str = str.replaceAll(" ", "");
        System.out.print("the string without spaces is: " + str);
    }
}