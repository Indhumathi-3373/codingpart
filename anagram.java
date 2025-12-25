import java.util.*;
public class anagram {
    public static void main(String args[]){
         Scanner scan=new Scanner(System.in);
        char[] name = scan.nextLine().toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] name2=scan.nextLine().toLowerCase().replaceAll("\\s", "").toCharArray();

         if(name.length==name2.length){
             Arrays.sort(name);
             Arrays.sort(name2);
            if(Arrays.equals(name,name2)){
                System.out.println("ANAGRAM");
            }else{
                System.out.println("NOT ANAGRAM");
            }
         }else{
            System.out.println("NOT ANAGRAM");
         }
 
        scan.close();
    }
}
