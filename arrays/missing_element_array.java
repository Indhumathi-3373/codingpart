package arrays;
import java.util.*;

public class missing_element_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int arr[] = new int[n-1]; 
        for(int i = 0; i < n-1; i++){
            arr[i] = sc.nextInt();
        } Arrays.sort(arr);int smallest=1;
      for(int i=0;i<n;i++){
          if(arr[i]==smallest){
              smallest++;
          }
      }System.out.println(smallest);sc.close();
 
    }
}