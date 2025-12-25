
import java.util.*;
public class fibonacci {
    static int fibo(int num,int fact){
        if(num==0 || num==1){
            return num;
        }else{
            return fibo(num-1)+fibo(num-2);
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int fact=in.nextInt();
        System.out.println(fibo(num,fact));in.close();
    }
}
