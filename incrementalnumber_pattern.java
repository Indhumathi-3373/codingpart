import java.util.Scanner;

public class incrementalnumber_pattern {
 
    public static void main(String args[]){
     Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
      for(int i=0;i<n;i++){
         for(int j=0;j<n-i;j++){
             System.out.print(" ");
         }
         for(int j=0;j<i+1;j++){
             System.out.print(i+" ");
         }
         System.out.println();
     }scan.close();
}
}//   0 
   //1 1
  //2 2 2
 //3 3 3 3
