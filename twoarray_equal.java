import java.util.*;
public class twoarray_equal {
 public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n1=scan.nextInt();
    int n2=scan.nextInt();
    int arr1[]=new int[n1];
    int arr2[]=new int[n2];
    int sum=0;
    System.out.println("enter elements for array 1 :");
    for(int i=0;i<=n1-1;i++){
        arr1[i]=scan.nextInt();
    }System.out.println("enter elements for array 2 :");
    for(int j=0;j<=n2-1;j++){
        arr2[j]=scan.nextInt();
    }
  if(arr1.length==arr2.length){
      for(int i=0;i<=arr1.length-1;i++){
        for(int j=0;j<=arr2.length-1;j++){
            int temp=arr1[i]+arr2[j];
             sum=sum+temp;
        }
      }System.out.println("Both arrays are same");
 }else{
    System.out.println("Both arrays are not same");
 }scan.close();
}
 } 