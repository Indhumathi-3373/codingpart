import java.util.*;
public class perfect_num {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }else{
                continue;
            }
        }
        if(sum==num){
            System.out.println(num+" is a perfect number");
        }else{
            System.out.println("not a perfect number");
        }
        
        scan.close();
    }
}
