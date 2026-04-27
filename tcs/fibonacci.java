

import java.util.*;

class Fibonacci{
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=0; int b=1;
        int c=0;
        for (int i =1; i<=n;i++){
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;

        }
        
    }
}