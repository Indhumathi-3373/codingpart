//recursion
import java.util.*;
public class sumofarrayrecursion {
    static int sum(int a[],int size){
         if(size==0){
            return 0;
         }
         return a[size-1] + sum(a,size-1);
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=scan.nextInt();
        }
        System.out.println(sum(a,size));scan.close();
        //sum of two array
        //for(int i=0;i<=arr1.length-1;i++){
        //for(int j=0;j<=arr2.length-1;j++){
          //  int temp=arr1[i]+arr2[j];
            // sum=sum+temp;
        //}
      //}
    }
}
