package exception_handiling;
import java.lang.Exception;
class null_pointer_exception extends Exception{
null_pointer_exception(String msg){
    super(msg);
}
}
public class nullpointerexception {

    public static void checkfornullstr(String name)throws null_pointer_exception{
      if(name.length()==0){
        throw new null_pointer_exception("null string exception");
      }
      System.out.println(name);
    }
    public static void main(String[] args) {
        try{
            checkfornullstr("");
        } catch (null_pointer_exception e) {
            
            System.out.println(e.getMessage());
        }
    }
}
