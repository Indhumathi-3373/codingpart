
import java.util.Scanner;

public class countdigitrecursion {
    static int digits(int num){
     if(num <=9){
        return 1;
     }
     return 1+ digits(num/10);
    }public static void main(String args[]){
         Scanner scan= new Scanner(System.in);
         int n=scan.nextInt();
        System.out.println(digits(n));scan.close();
    }
}
