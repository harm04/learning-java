

import java.util.*;

class Pallindrome {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.print(temp == rev ? "Pllindrome" : "Not pallindrome");
    }
}
    