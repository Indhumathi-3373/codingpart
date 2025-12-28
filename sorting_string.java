import java.util.*;
public class sorting_string {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String words=scan.nextLine().trim();
        char[] ch=words.toCharArray();
        char temp;
        // using built in method
        // Arrays.sort(ch);
        // String sorted=new String(ch);
        // System.out.println("sorted string using built-in methods : " + sorted);
        //without built-in methods
        for(int i=0;i<ch.length-1;i++){
            for(int j=i+1;j<ch.length;j++){
              if(ch[i]>ch[j]){
                 temp=ch[i];
                ch[i]=ch[j];
                 ch[j]=temp;
            }
          }
        }for(char c:ch) System.out.print(c);
        scan.close();
    }
}
