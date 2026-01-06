import java.util.*;
public class reverse_string_recursion {
    static char reverse(char[] arr){
     if(arr.length==1){
        return arr[0];
     }
 return 0;
    }
public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    String text=scan.nextLine();
    char[] arr=text.toCharArray();
    System.out.println(reverse(arr));scan.close();
}     
}
