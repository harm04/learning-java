

import java.util.*;

class LargetOfThree {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int largest = Math.max(a, Math.max(b, c));
        System.out.println(largest);
    }
}
