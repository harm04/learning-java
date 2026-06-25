/*wap to print trhe last character of every word in the string input: Hello world this is java output: o d s s a*/

package IPA;

import java.util.Scanner;

class LastCharOfEveryWord {
     public static void main(String[] arr){
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the string: ");
         String str=sc.nextLine();
         String[] words=str.split("\\s+");
         for(int i=0;i< words.length;i++){
             System.out.print(words[i].charAt(words[i].length()-1)+" ");
         }
     }
}
