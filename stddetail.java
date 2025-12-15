
import java.util.*;
public class stddetail{
    public static void main(String args[]){
      Scanner scan=new Scanner(System.in);
      System.out.println("enter name");
      String name=scan.nextLine();
      System.out.println("enter age");
      int age=scan.nextInt();
      System.out.println("enter cgpa");
      float cgpa=scan.nextFloat();
      System.out.println("enter grade");
      char grade=scan.next().charAt(0);
      
      System.out.println("name:"+name);
      System.out.println("age:"+age);
      System.out.println("cgpa:"+Math.floor(cgpa*100/100));
      System.out.println("grade:"+grade);
        scan.close();
    }
}