//leap year:
// should be divisible by 400
//should be divisible by 4 and should not be divisible by 100



import java.util.*;

class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.print("Leap year");
        } else {
            System.out.print("Not a leap year");
        }
    }
}