package basics;
import java.util.*;
public class zero_last {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        int count=0;
        int num2=0;
        while(t>0){
            int num=scan.nextInt();
            t--;
        while(num>0){
            int num1=num%10;
            if(num1==0){
                count++;
            }else{
                num2=num2*10+num1;//for adding digits like 1+1=11
            }
        for(int i=0;i<count;i++){
            System.out.print("0");
            
          } System.out.println();num2=0;count=0; }scan.close();}
}
}