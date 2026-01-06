import java.util.*;
public class gcdrecursion {
// USING RECURSION;
     static int gcd(int num,int num2){
        
         if(num2==0){
             return num;
         }
         else{
             return gcd(num2, num%num2);
         }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println(gcd(num,num2));
        scan.close();
    }
}
