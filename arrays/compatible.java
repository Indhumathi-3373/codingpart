package arrays;
import java.util.*;

public class compatible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int arr[] = new int[n1];
        int arr2[] = new int[n2];
        System.out.println("enter element for array 1");
        for (int i = 0; i <= n1 - 1; i++) arr[i] = scan.nextInt();System.out.println("enter element for array 1");
        for (int j = 0; j <= n2 - 1; j++)  arr2[j] = scan.nextInt();
        int flag=0;
        if (n1 == n2) {
            for (int i = 0; i <= n1 - 1; i++) {//both array have same size and same elements in same order
                    if (arr[i] < arr2[i]) {
                        flag=1;break;
                    } 
            }if(flag==0){
                System.out.println("compatible");
            }else {
                        System.out.println("incompatible");
                        
                    }
        }scan.close();
    }

}