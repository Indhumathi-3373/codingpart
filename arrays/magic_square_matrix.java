package arrays;
import java.util.*;

public class magic_square_matrix {
    public static void main(String argd[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array :");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("enter array element :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int magic_sum = 0;//sum of one row we have to take this as reference for magic square matrix
        for (int i = 0; i < n; i++) {
            magic_sum += arr[0][i];
        }

        for (int i = 1; i < n; i++) {
            int row_sum = 0;
            for (int j = 0; j < n; j++) {
                row_sum += arr[i][j];
            }
            if (row_sum != magic_sum) {
                System.out.println("IT IS NOT MAGIC SQUARE");
            
            sc.close();//exit code after if part fails
            return;
        }
    }
        for (int col = 0; col < n;col++) {
            int col_sum = 0;
            for (int i = 0; i < n; i++) {
                col_sum += arr[i][col];
            }
            if (col_sum != magic_sum) {
                System.out.println("IT IS NOT MAGIC SQUARE");
            
            sc.close();
            return;
        }
    }
        int diagonal1 = 0;
        for (int i = 0; i < n; i++) {
            diagonal1 += arr[i][i];
        }
        int diagonal2 = 0;
        for (int i = 0; i < n; i++) {
            diagonal2 += arr[i][n - 1 - i];
        }

        if (diagonal1 == magic_sum && diagonal2 == magic_sum) {
            System.out.println("IT IS MAGIC SQUARE MATRIX");
        } else {
            System.out.println("IT IS NOT MAGIC SQUARE MATRIX");
        }
        sc.close();
    }

}
