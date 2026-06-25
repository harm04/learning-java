/*find character of a string at odd index input: Management output: aaeet*/

package  IPA;

import java.util.Scanner;

class PrintCharAtOddIndex{
    public static void  main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=1;i<str.length();i+=2){
            System.out.print(str.charAt(i));
        }
    }
}