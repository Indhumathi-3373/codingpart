import java.io.*;
import java.util.*;

public class multiplication_two_matrix
{

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        int arr1[][]=new int[size1][size1];
        int arr2[][]=new int[size2][size2];
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                arr1[i][j]=sc.nextInt();
            }
        }for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }int sum;
        for(int k=0;k<size1;k++){
        for(int i=0;i<size1;i++){
            sum=0;
            for(int j=0;j<size2;j++){
                sum+=arr1[k][j]*arr2[j][i];
            }System.out.print(sum+" ");
        }System.out.println();
    }}
}