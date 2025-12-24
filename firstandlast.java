 import java.util.*;
 public class firstandlast{
     public static void main(String args[]){
         Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
         int original=n;
         int fd;
         int ld;
         int count=0;
         if(n<0){
            n=Math.abs(n);original=n;
         }
         while (n>0) {
            count++;
            n=n/10;
         }if(count==2){
            fd=original/10;
            ld=original%10;
            System.out.println(fd+ld);
         }else if(count==3){
            fd=original/100;
            ld=original%10;
            System.out.println(fd+ld);
         }else{
            fd=original/1000;
            ld=original%10;
            System.out.println(fd+ld);
         }
    scan.close();}
}

