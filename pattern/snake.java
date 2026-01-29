package pattern;
import java.util.*;
public class snake {
    public static void main(String args[]){
     Scanner scan=new Scanner(System.in);
    int n1=scan.nextInt();
    int n2=scan.nextInt();
    int arr1[][]=new int[n1][n2];
    System.out.println("enter elements for array :");
    for(int i=0;i<n1;i++){
         for(int j=0;j<n1;j++){
             arr1[i][j]=scan.nextInt();
            }
    }for(int i=0;i<n1;i++){
        if(i%2==0){  //row always start from index 0
               for(int j=0;j<n2;j++){//should iterate until column
               System.out.print(arr1[i][j]);
               }
           }else{
            for(int j=n2-1;j>=0;j--){
              System.out.print(arr1[i][j]); 
            }
           }
        }scan.close();
    }
}
