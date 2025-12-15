 import java.util.*;
 public class firstandlast{
     public static void main(String args[]){
         Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
         int ld=n%10;
         int fd=n%1000;
         if(n<0){
            n=Math.abs(n);
            System.out.println(ld+fd);
         }else{
         System.out.println(ld+fd);
     }
    scan.close();}
}

