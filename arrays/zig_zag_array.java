package arrays;
import java.util.*;

public class zig_zag_array {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter size of an array :");
        int size=scan.nextInt();
        int arr[][]=new int[size][size];
        System.out.println("enter element of an array :");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
              arr[i][j]=scan.nextInt();}
        }
        for(int i=0;i<size;i++){
          System.out.print(arr[0][i]+" ");   
        }     
        for(int j=1;j<size-1;j++){
            System.out.print(arr[j][size-j-1]+" ");
        }   
         for(int j=0;j<size;j++){
            System.out.print(arr[size-1][j]+" ");
        }
       
scan.close();
        }
    }
