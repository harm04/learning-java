/*take an integer as an input and calculate the sum of its digit. if the sum is divisible by 3 then print true else print false input: 123 output: true*/

package  IPA;

import java.util.Scanner;

class SumOfNumDivisibleBy3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        int sum=0;
        while(num>0){
            int last=num%10;
            sum+=last;
            num=num/10;
        }
        if(sum%3==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}