import java.util.Scanner;
public class mangotree {
 public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int row=scan.nextInt();
int column=scan.nextInt();
int tree=scan.nextInt();
if(tree<= column || tree%column==1 || tree%column==0 ){
    System.out.println("mango tree");
}else{
    System.out.println("not a mango tree");
}
scan.close();
 }   
}
