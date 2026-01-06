import java.util.Scanner;

public class sum_of_twoarray {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int sum=0;
        int n=scan.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        System.out.println("enter element for array one:");
        for(int i=0;i<n;i++){
            arr1[i]=scan.nextInt();
        }  System.out.println("enter element for array two:"); for(int j=0;j<n;j++){
            arr1[j]=scan.nextInt();
        }
        for(int i=0;i<=arr1.length-1;i++){
        for(int j=0;j<=arr2.length-1;j++){
             temp=arr1[i]+arr2[j];
             
        }
      }System.out.println(sum);scan.close();
    }
}
