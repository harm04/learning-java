/*wap to count the number of even digits and odd digits in a number input: 482357926 output: even :5 odd : 4*/

package IPA;

import java.util.Scanner;

class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the long number: ");
        long num = Long.parseLong(sc.nextLine());
        int even = 0;
        int odd = 0;
        while(num>0){
            long last=num%10;
            if(last%2==0){
                even++;
            }else{
                odd++;
            }
            num=num/10;
        }
        System.out.println("even: "+ even+" odd: "+odd);
    }
}
