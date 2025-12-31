import java.util.*;
public class separate_int_string {
public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    String input=scan.nextLine().toLowerCase();;
    String text=input.replaceAll("[0-9]","");
    String num=input.replaceAll("[a-z]","");
    int sum=0;
    int number=Integer.parseInt(num);
    System.out.println(input);
    System.out.println("after ignoring numbers input will be : "+text);
    System.out.println("after ignoring alphabets input will be : "+number);
    while(number>0){
        int x=number%10;
        sum=sum+x;
        number=number/10;
    }System.out.println("ADDITION OF THE EXTRACTED NUMBER : "+sum);
    scan.close();
}    
}
