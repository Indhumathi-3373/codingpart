import java.util.Scanner;

public class minarray_ternaryoperation {
      public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter size of an array :");
    int size=scan.nextInt();
    System.out.println("enter array elements :");
    int a[]=new int[size];
    for(int i=0;i<size;i++){
       a[i]=scan.nextInt();
    }
    int c=0;
     System.out.println("minimum element of an array using ternary operator:");
        for(int i=0;i<1;i++){
            for(int j=0;j<size-1;j++){
            if(a[i]>a[j+1]){
                c=a[j+1];
                a[i]=c;

            }
        }System.out.println(a[i]);
    }scan.close();
      }
    }
