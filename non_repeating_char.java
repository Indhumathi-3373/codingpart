import java.util.*;
public class non_repeating_char {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        
        String name=scan.nextLine().trim().toLowerCase();
        char[] ch=name.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    ch[j]='0';
                }}
        }for(char c:ch){
            if(c!='0'){
              System.out.print(c);
            }
        }
        scan.close();
    }
}
