/*wap to reverse the words in a string (keeping each word intact but reversing theier order) input: Hello world this is Java output: Java is this world hello*/

package  IPA;

import java.util.Scanner;

class ReverseWordsInString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split("\\s+");
        for(int i =words.length-1;i>=0;i--){
            System.out.print(words[i]);
            if(i!=0){
                System.out.print(" ");
            }
        }
    }
}