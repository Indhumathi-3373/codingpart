package arrays;
import java.util.*;

public class duplicateandcount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int count = 0;
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) arr[i] = scan.nextInt();
        for (int i = 0; i < size; i++) {
            for(int j=i+1;j<size;j++)
                if (arr[i] == arr[j]) {
                   arr[j]=-1;
                } 
        }
        for(int i=0;i<size;i++){
            if(arr[i]!=-1){
                count++;
                System.out.print("\ndistinct array value:"+arr[i]+" ");
            }
        }
        System.out.println("\ncount of distinct element :"+(count));scan.close();

    }
}

