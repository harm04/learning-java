import java.util.*;

class StrongNumber {
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (temp != 0) {
            int r = temp % 10;
            temp = temp / 10;
            sum += factorial(r);
        }
        System.out.println(n == sum ? "strong number" : "not a strong number");
    }
}