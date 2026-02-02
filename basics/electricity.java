package basics;
import java.util.*;
public class electricity {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter no of unit consumed:");
        int unit=scan.nextInt();
        if(unit<=200){
            float c=unit/100;
            float cost=(float) (c * 0.50);
            System.out.println("electricity bill for your house:"+cost);
        }else if(unit<=400){
            float c=unit/100;
            float cost=(float)((c*0.65)+100);
            System.out.println("electricity bill for your house:"+cost);
        }else if(unit<=600){
            float c=unit/100;
            float cost=(float)((c*0.85)+250);
            System.out.println("electricity bill for your house:"+cost);
        }else{
            float c=unit/100;
            float cost=(float)((c*1.10)+400);
            System.out.println("electricity bill for your house:"+cost);
        }
        scan.close();
    }
}
