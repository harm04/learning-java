import java.util.*;

class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base = sc.nextInt();
        System.out.println("Enter the power number: ");
        int power = sc.nextInt();
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        System.out.println("result: " + result);
    }
}