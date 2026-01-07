//recursion upto 1000
import java.util.*;
public class num_to_binary {
    static int binary(int num){
     if(num==0){
        return 0;
     }
     return num%2 + (10*binary(num/2));
    }
    public static void main(String args[]){
      Scanner scan =new Scanner(System.in);
      int num=scan.nextInt();
      System.out.println(binary(num));scan.close();
    }
}
