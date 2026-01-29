package string;
import java.util.*;
public class count_vowels_consonents {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String word=sc.nextLine();
    String vowels="aeiou";int count=0,conso=0;
    for(int i=0;i<word.length();i++){
         char ch = word.charAt(i);
          if(vowels.indexOf(ch)!=-1){
       count++;
    }
    else{
        conso++;
    }
    }
    System.out.println("vowels = "+count);
     System.out.println("consonents = "+conso);sc.close();
   } 
}
