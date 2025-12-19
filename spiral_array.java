import java.util.*;
public class spiral_array{
    public static void main(String args[]){
     Scanner scan=new Scanner(System.in);
    int n1=scan.nextInt();
    int arr1[][]=new int[n1][n1];
    System.out.println("enter elements for array :");
    for(int i=0;i<n1;i++){
         for(int j=0;j<n1;j++){
             arr1[i][j]=scan.nextInt();
            }
    }for(int i=0;i<1;i++){
        for(int j=i;j<n1;j++){
                System.out.print(arr1[i][j]);
        }for(int j=1;j<n1;j++){
              System.out.print(arr1[j][n1-i-1]);
            }
        for(int j=n1-1;j<n1;j--){

        }
        }
    }
    }
