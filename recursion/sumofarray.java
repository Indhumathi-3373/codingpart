
package recursion;

import java.util.*;

public class sumofarray {
 static int sumarray(int size,int arr[]){
     if(size==1){
         return arr[0];
     }
     return arr[size-1]+sumarray(size-1,arr);
 }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }System.out.println(sumarray(size,arr));
       sc.close();
    }
}