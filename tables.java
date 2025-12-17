import java.util.Scanner;
public class tables {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int line=scan.nextInt();
        int n=scan.nextInt();
        for(int i=1;i<=line;i++){
        System.out.println(i+" X "+n+" = "+(i*n));
        }scan.close();
    }
}
