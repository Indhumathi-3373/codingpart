package arrays;
import java.util.*;
public class sortingarray_descending {
   public static void main(String args[]){
    Scanner scan=new Scanner(System.in);System.out.println("size for array");
    int size1=scan.nextInt();
    int arr1[]=new int[size1];System.out.println("enter element for array ");
    for(int i=0;i<size1;i++) arr1[i]=scan.nextInt();
    System.err.println("\nDescending order :");
    for(int i=0;i<arr1.length;i++){
      for(int j=i+1;j< arr1.length;j++){
            if(arr1[i]<arr1[j]){

               int temp=arr1[i];
               arr1[i]=arr1[j];
               arr1[j]=temp;
               
            }   
         }System.out.print(arr1[i]);
    }
    
    scan.close();
    }
}
