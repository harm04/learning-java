import java.util.*;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        String str = "";
        while (temp != 0) {
            int r = temp % 2;
            temp = temp / 2;
            str = r + str;
        }
        System.out.println("binary number: " + str);
    }
}