
import java.util.*;
class EvenOdd{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n + " is an even number.");
        } else {
            System.out.println(n + " is an odd number.");
        }

    }
}