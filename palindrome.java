//using reverse function 

 import java.util.*;
 public class palindrome {
     public static void main(String args[]){
         Scanner scan=new Scanner(System.in);
         String str=scan.nextLine();
         String name=new StringBuilder(str).reverse().toString();
         if(name.equals(str)){
             System.out.println("palindrome");
         }
        else{
             System.out.println("not palindrome");
         }scan.close();
   }
}
