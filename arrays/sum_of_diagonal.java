package arrays;
import java.util.*;

public class sum_of_diagonal {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        
        int diagonal=0;
        int arr1[][] = new int[n1][n1];
        System.out.println("enter elements for array :");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                arr1[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < n1; i++) {
             diagonal+=arr1[i][i];
            
        }System.out.print(diagonal);
        scan.close();
    }
}
