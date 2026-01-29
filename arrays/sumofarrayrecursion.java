package arrays;
//one dimensional array
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
        
        
    }
}
