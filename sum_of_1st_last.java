import java.util.Scanner;

public class sum_of_1st_last {
       public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        
        int size=scan.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=scan.nextInt();
        }
        
        System.out.println(a[0]+a[size-1]);scan.close();
        
        
    }
}
