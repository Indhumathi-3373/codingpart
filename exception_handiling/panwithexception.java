package exception_handiling;
import java.util.*;
import java.util.regex.Pattern;
import java.lang.Exception;
class regex_with_exception extends Exception{
    public regex_with_exception(String pan){
        super(pan);
    }
}
public class panwithexception {
    static void pancard(String pan)throws regex_with_exception {
    String regex_pan="^[a-zA-Z]{5}\\d{4}[a-zA-Z]{1}$";
    Pattern pattern=Pattern.compile(regex_pan);
    if(!pattern.matcher(regex_pan).matches()){
        throw new regex_with_exception("PAN must be in format: ABGHJ1010x");
    }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
     System.out.println("enter pan card number");
     String pan=sc.nextLine();
     while(!pan.equals("stop")){
        try{
            pancard(pan);
            System.out.println("valid pan");
        }catch(regex_with_exception e){
            System.out.println(e.getMessage());
        } pan=sc.nextLine();
     }
    sc.close();
    }
   
}
