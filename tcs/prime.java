
import java.util.*;

class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;
        // check if number is less than 1
        if (n <= 1) {
            prime = false;
        }
        // check if number is 2
        else if (n == 2) {
            prime = true;

        }
        //check for even numbers
        else if(n%2==0){
            prime=false;
        }
        // for loop starting with i=3 to i <= sq. root of n and incrementing with 2 to
        // avoid even numbers
else{
    for (int i=3;i<=Math.sqrt(n);i+=2){
        if(n%i==0){
            prime=false;
            break;
        }
    }
}
System.out.print(prime?"Prime":"not prime");
    }
}