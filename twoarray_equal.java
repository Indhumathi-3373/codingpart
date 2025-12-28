import java.util.*;
public class twoarray_equal {
 public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n1=scan.nextInt();
    int n2=scan.nextInt();
    int arr1[]=new int[n1];
    int arr2[]=new int[n2];
    boolean equal=false;
    System.out.println("enter elements for array 1 :");
    for(int i=0;i<=n1-1;i++){
        arr1[i]=scan.nextInt();
    }System.out.println("enter elements for array 2 :");
    for(int j=0;j<=n2-1;j++){
        arr2[j]=scan.nextInt();
    }
  if(arr1.length==arr2.length){
    //below check both array order whether same or not
    // for(int i=0;i<n1;i++){
    //     if(arr1[i]!=arr2[i]){
    //       equal=false;
    //       break;
    //     }
    // }
    //below checks whether one array contains element of another array 
    if(Arrays.equals(arr1,arr2)){equal =true;}
  }
  if(equal){
      System.out.println("Both arrays are same");
 }else{
    System.out.println("Both arrays are not same");
 }scan.close();
}}
 