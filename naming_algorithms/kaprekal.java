package naming_algorithms;
import java.util.Scanner;

public class kaprekal {
    public static void main(String args[]){
     Scanner scan=new Scanner(System.in);
     int number=scan.nextInt();
     int square=number*number;
     int original=number;
     int count=0;
     while(number>0){
        number=number/10;
        count++;
     }
     int c=(int)Math.pow(10,count);
     int reminder=square%c;
     int quotient=square/c;
     int sum=reminder+quotient;
     if(original==sum){
        System.out.println("Kaprekar Number");
     }else{
        System.out.println("Not a Kaprekar Number");
     }
     scan.close();
    }
    
}
