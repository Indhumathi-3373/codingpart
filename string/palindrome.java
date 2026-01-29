package string;
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
//without built in methods
// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         String A=sc.next();
//         String b="";
//         for(int i=A.length()-1;i>=0;i--){
//             b+=A.charAt(i);
//         }if(A.equals(b)){
//             System.out.println("Yes");
//         }else{
//             System.out.println("No");
//         }
        
//     }
// }