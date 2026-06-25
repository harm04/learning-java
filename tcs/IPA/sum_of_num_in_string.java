/*wap to calculate the sum of numbers from the string input: 123hello1998world10 output: 2131*/

package IPA;

import java.util.Scanner;

class SumOfNumInString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        int sum=0;
        int num=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }else{
                sum+=num;
                num=0;
            }
        }
        sum+=num;
        System.out.println(sum);
    }
}