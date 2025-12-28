
import java.util.*;
public class fibonaccirecursion {
    static int fibo(int num){
        if(num==0 || num==1){
            return num;
        }else{
            return fibo(num-1)+fibo(num-2);
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        for(int i=0;i<=num;i++)
          System.out.print(fibo(i));in.close();
    }
}
