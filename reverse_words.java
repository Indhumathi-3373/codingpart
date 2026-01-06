import java.util.*;
public class reverse_words {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String a[]=scan.nextLine().split(" ");//split input into separate words according to space 
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }scan.close();
    }
}
