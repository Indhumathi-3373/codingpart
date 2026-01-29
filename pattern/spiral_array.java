package pattern;
import java.util.*;
public class spiral_array{
    public static void main(String args[]){
     Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    
    int arr1[][]=new int[n][n];
    System.out.println("enter elements for array :");
    for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             arr1[i][j]=scan.nextInt();
            }
    }
    double r=Math.ceil(((double)n/2));
    for(int i=0;i<r;i++){
        for(int j=i;j<=n-1-i;j++){
                System.out.print(arr1[i][j]+" ");
         }for(int j=1+i;j<=n-i-1;j++){
            System.out.print(arr1[j][n-1-i]+" ");
         }for(int j=n-i-2;j>=i;j--){
             System.out.print(arr1[n-i-1][j]+" ");
         }for(int j=n-i-2;j>i;j--){
            System.out.print(arr1[j][i]+" ");
         }
        }scan.close();
    }}
    
