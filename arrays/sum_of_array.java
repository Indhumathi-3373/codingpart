package arrays;
import java.util.Scanner;

public class sum_of_array {
        public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int sum=0;
        int size=scan.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=scan.nextInt();
            sum+=a[i];
        }
        
        System.out.println(sum);scan.close();
        
        
    }
}
