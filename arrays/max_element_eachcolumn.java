package arrays;

import java.util.*;

public class max_element_eachcolumn {

    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
   int n2=sc.nextInt();
    int arr1[][]=new int[n1][n2];
    for(int i=0;i<n1;i++){
         for(int j=0;j<n2;j++){
             arr1[i][j]=sc.nextInt();
         }
    }
    for(int i=0;i<n2;i++){
         int temp=0;
        for(int j=0;j<n1;j++){
            if(arr1[j][i]>temp){
                temp=arr1[j][i];
            }
        }System.out.println(temp);
    }
sc.close();
    }
}