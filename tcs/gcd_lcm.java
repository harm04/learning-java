


import java.util.*;

class GcdLcm {
    public static void main(String[] args) {
        int a, b, c, d;
        System.out.print("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        c = a;
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        d = b;
        // GCD
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            if (b > a) {
                b = b - a;
            }
        }
        // LCM
        int lcm = (c * d) / a;
        System.out.print("GDC: " + a + "\n");
        System.out.print("LCM: " + lcm);
    }
}