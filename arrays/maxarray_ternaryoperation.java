package arrays;
import java.util.Scanner;

public class maxarray_ternaryoperation {
      public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter size of an array :");
    int size=scan.nextInt();
    System.out.println("enter array elements :");
    int a[]=new int[size];
    for(int i=0;i<size;i++){
       a[i]=scan.nextInt();
    }
    int temp=0;
     System.out.println("minimum element of an array using ternary operator:");
       
            for(int j=0;j<size;j++){
            if(a[0]<a[j]){
            temp=a[j];
            a[j]=a[0];
            a[0]=temp;
            }// using built in methods int min=Arrays.stream(a).max().getAsInt()
            
            
        }System.out.println(a[0]);
    scan.close();
      }
    }

