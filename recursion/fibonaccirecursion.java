package recursion;

import java.util.*;
public class fibonaccirecursion {



       static int fibo(int num){
           if( num==1 ){
               return 0;
           }
          else if( num==2){
              return 1;
          }
               return fibo(num-1)+fibo(num-2);
           
       }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        System.out.println("The term "+num+" in the Fibonacci series is "+fibo(num));sc.close();
    }
}

