/*
in main method read 5 values for integer array and another 2 values which are the limits (limit 1 and limit 2), the method should print the avegrage of integer values which aare greater than 2 and less than 6. for example if the values are 1 2 3 4 5  and limits are 2 and 6 then the average is 4 (3 4 5)*/

package IPA;

import java.util.Scanner;

class AvgWithLimits {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr =new int[5] ;
        for(int i =0; i <5;i++){
            System.out.print("Enter "+i+" th element: ");
            arr[i]=Integer.parseInt(sc.nextLine());
        }
        int limit1=Integer.parseInt(sc.nextLine());
        int limit2=Integer.parseInt(sc.nextLine());
        int sum=0;
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>limit1 && arr[i]<limit2){
                sum+=arr[i];
                count++;
            }
        }
        if(count>0){
            System.out.println("avg: "+ sum/count);
        }else {
            System.out.println(0);
        }
    }
}
