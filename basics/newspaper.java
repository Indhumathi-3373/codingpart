package basics;
import java.util.*;
public class newspaper{
    public static void main(String args[]){
      Scanner scan=new Scanner(System.in);
      int copy=scan.nextInt();
      int price=scan.nextInt();
      int spent=scan.nextInt();
      int copyprice=copy*price;
      int s=copy*spent;
      int profit=copyprice-s-100;//profit=(copy*price)-(copyprice*spent)-100 
      System.out.println("total copies:"+copy);
      System.out.println("price of the each copy:"+price);
      System.out.println("spent amount of gerald for each copy"+spent);
      System.out.println("profit"+profit);
      scan.close();
    }
}