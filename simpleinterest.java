import java.util.*;
public class simpleinterest{
    public static void main(String args[]){
      Scanner scan=new Scanner(System.in);
      int principle=scan.nextInt();
      int interest=scan.nextInt();
      int years=scan.nextInt();
      float inr=interest/100f;//(principle*interest*years)/100
      float SI=principle*years*inr;
      float totalamount=principle+SI;
      float discount=2;
      float discamount=totalamount*(discount/100);
      System.out.println("simple interest "+SI);
      System.out.println("discount "+Math.floor(discount*100)/100);
      System.out.println("discounted amount "+Math.floor(discamount*100)/100);
      System.out.println("total amount paid by leena "+totalamount);
      System.out.println("final settlement after discount :"+Math.floor((totalamount-discamount)*100)/100);
      scan.close();
    }
}