package arrays;
//example size 8 array 10 98 3 33 12 22 21 11
//first two is even 3rd is odd means checking from last for any even value available if yes means swap  3 to that even value
//output should be 10 98 22 12 33 3 21 11

import java.util.*;

public class swap_eve_odd_array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];int left=0,right=size-1;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array after Segregation");
        while(left<right){
            if(arr[left]%2==0){
                left++;
            }else if(arr[right]%2==0){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
            }else{
                right--;
            }
        }for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }sc.close();
    }
}