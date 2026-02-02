package basics;
import java.util.Scanner;

public class gcd_ternaryoperation {
      public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int num2=scan.nextInt();
          int temp;
          while(num2!=0){
              temp=num%num2;
              num=num2;
             num2=temp;
          }System.out.println(num);
        
        scan.close();
    }
}

