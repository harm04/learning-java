/*wap to count the number of prime digits in a number input: 254786135 output: 5*/

package IPA;

import java.util.Scanner;

class CountPrime{
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        long num=Long.parseLong(sc.nextLine());
        int count=0;
        while(num>0){
            long last=num%10;
            if(last==2||last==3||last==5||last==7){
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
}