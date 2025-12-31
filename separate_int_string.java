import java.util.*;
public class separate_int_string {
public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    String input=scan.nextLine().toLowerCase();;
    String text=input.replaceAll("[0-9]","");
    String num=input.replaceAll("[a-z]","");
    System.out.println(input);
    System.out.println("after ignoring numbers input will be : "+text);
    System.out.println("after ignoring alphabets input will be : "+num);scan.close();
}    
}
