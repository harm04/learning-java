import java.util.*;

class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int n = sc.nextInt();
        int index = 0;
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            n = n / 10;
            sum += r * Math.pow(2, index);
            index++;
        }
        System.out.println("decimal no: " + sum);
    }
}