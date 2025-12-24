
import java.util.*;
public class fibonacci {
    static int fibo(int num,int fact){
        if(num==0 || num==1 && fact<=num){
            return 1;
        }else{
            return fact+fibo(num-1,fact);
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int fact=in.nextInt();
        System.out.println(fibo(num,fact));
    }
}
