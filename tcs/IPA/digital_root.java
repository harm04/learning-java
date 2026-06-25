/*
digital root( repeated sum of digits until one digit) input: 195 output: 6*/
package IPA;

import java.util.*;

class DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = Integer.parseInt(sc.nextLine());
        while(num>=10){
            int sum=0;
            while(num!=0){
                int last=num%10;
                sum+=last;
                num=num/10;
            }
            num=sum;
        }
        System.out.println(num);
    }
}