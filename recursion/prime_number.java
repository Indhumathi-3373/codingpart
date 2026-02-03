package recursion;
import java.util.*;
public class prime_number {
    static boolean isprime(int n,int divisor){
        if(n<=1){
            return false;
        }
        if(divisor*divisor>n) return true;
        if(n%divisor==0) return false;
        return isprime(n,divisor+1);
    }
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(isprime(n,2)){
    System.out.println("prime");

}else{
System.out.println("not prime");}
    sc.close();}
}
