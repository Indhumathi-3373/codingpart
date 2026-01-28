import java.lang.Exception;

class InsufficientBalanceexception extends Exception{
    InsufficientBalanceexception(String msg){
        super(msg);
    }
}
public class custom_exception {
    static void withdraw(int bal,int amt)throws InsufficientBalanceexception{
        if(amt>bal){
            throw new InsufficientBalanceexception("low balance "+bal);
        }
            System.out.println("amount withdrawed ! total balanced "+(bal-amt));
       
    }
    public static void main(String[] args){
        try{
            withdraw(10000,10000);
        }catch(InsufficientBalanceexception e){
               System.out.println(e.getMessage());
        }
    }
}
