//package exception_handling;
import java.util.*;
import java.util.regex.Pattern;
import java.lang.Exception;
class invalidnumber extends Exception{
    public invalidnumber(String msg){
        super(msg);
    }
}
public class mobile_numberwithexception {
    static void numberchecker(int number)throws invalidnumber{
        String  number1=Integer.toString(number);
        String regex="^(\\91|+91)?[6-9][0-9]{9}$";
        Pattern p=Pattern.compile(regex);
        if(!p.matcher(number1).matches()){
          throw new invalidnumber("number is valid");
        }
    } 
    public static void main(String[] args) {
        System.out.println("enter mobile number");
                Scanner sc=new Scanner(System.in);
 int number=sc.nextInt();
 try{
numberchecker(number);
 }catch(invalidnumber e){
    System.out.println(e.getMessage());
 }
 
 sc.close();    }
}