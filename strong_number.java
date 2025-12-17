import java.util.*;
public class strong_number {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");//145
    int num=sc.nextInt();
    int originalNum=num;
    int sum=0;
    
    while(num>0){
        int reminder=num%10;
        int fact=1;
        for(int i =1;i<=reminder;i++){
            fact=i*fact;
            // System.out.println(fact);
        }
        sum+=fact;
        num=num/10;
    }// System.out.println(sum);
    if(sum==originalNum){
        System.out.println("Strong number");
    }
    else{
        System.out.println("not a strong number");
    }sc.close();
   }
}


