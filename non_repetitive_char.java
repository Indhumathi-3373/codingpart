import java.util.*;

public class non_repetitive_char {
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
        }
        // for (char c : ch) {// print all non repetitive characters
        //     if (c != '0') {
        //         System.out.print(c);
        //     }

        // }
        boolean repetitive = true;
        for (char c : ch) {
            if (c != '0') {//if one character matches 0 it becomes repetive
                repetitive = false;
                break;
            }
        }
        if (repetitive) {
            System.out.println("\n"+"all characters are repetitive");
        } else {
            for (char c : ch) {
                if (c != '0') {
                    System.out.println("\n"+c);
                    break;
                }
            }
        }
        scan.close();
    }

}