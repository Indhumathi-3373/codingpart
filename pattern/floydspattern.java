package pattern;
import java.util.*;
public class floydspattern {
    public static void main(String args[]){
     Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
     int k=0;
     for(int i=0;i<n;i++){
         for(int j=0;j<i+1;j++){
            k=k+1;
            System.out.print(k+" ");
         }
        System.out.println();
         }
     scan.close();
     }    
}
//1 
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15