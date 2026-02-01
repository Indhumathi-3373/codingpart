//package exception_handling;
import java.util.*;
public class exception_handling {
    static void throwex() throws Exception{
        throw new Exception("nothing to read in throwex");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter element");
        try{
            int n=sc.nextInt();
            System.out.println(n/0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("this code runned successfully");
        }
        
        sc.close();
    }
}
