
import java.util.*;
public class fibonaccirecursion {
    static int fibo(int num,int fact){
        if(num==0 || num==1){
            return num;
        }else{
            return fact;
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int fact=in.nextInt();
        System.out.println(fibo(num,fact));in.close();
    }
}
