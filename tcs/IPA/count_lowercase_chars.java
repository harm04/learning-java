/*String input: DataBaSe output : 5*/

package  IPA;

import java.util.Scanner;

class CountLowercaseChars{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(int i =0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}