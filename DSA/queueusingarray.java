package DSA;
import java.util.*;
public class queueusingarray {
    public static void main(String[] args) {
        Queue<String> printer=new LinkedList<>();
        printer.add("process 1");
        printer.add("process 2");
        printer.add("process 3");
        while(!printer.isEmpty()){
            System.out.println("executing : "+printer.poll());
        }
    }
}
