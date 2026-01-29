package string;
import java.util.*;

public class remove_dup_string{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine().toLowerCase();
        char[] ch = name.replaceAll(" ","").toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            if(ch[i]=='0') continue;
            for (int j = i + 1; j < ch.length; j++) {// remove duplicates by marking them as 0
                if (ch[i] == ch[j]) {
                    ch[j] = '0';  
                    ch[i]='0'; 
                  
                }
            }
        }for(char k:ch){
            if(k!='0'){
                System.out.print(k);
            }  
            }scan.close();
    }}