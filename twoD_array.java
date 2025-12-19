import java.util.*;
public class twoD_array {
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
    }
    for(int i=0;i<n1;i++){for(int j=0;j<n1;j++){ System.out.print(arr1[i][j]);}System.out.println();}
    System.out.println("\nTRANSPOSE OF AN ARRAY");
    for(int i=0;i<n1;i++){for(int j=0;j<n1;j++){ System.out.print(+arr1[j][i]);}System.out.println();}scan.close();
    }
    }

