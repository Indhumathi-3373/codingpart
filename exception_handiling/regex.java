package exception_handiling;
import java.util.*;
import java.util.regex.*;

public class regex {
   static void email(String regex, String value) {
      Boolean result = Pattern.matches(regex, value);
      if (result) {
         System.out.println(result+"valid Email");
      } else {
         System.out.println(result+"email invalid");
      }
   }

   static void password(String regex1, String pass) {
      if (Pattern.matches(regex1, pass)) {
         System.out.println(pass+"valid password");
      } else {
         System.out.println(pass+"invalid password");
      }
   }

   static void indianmobile(String number, String numregex) {
      if (Pattern.matches(numregex, number)) {
         System.out.println(number + " is valid");
      } else {
         System.out.println("number is invalid");
      }
   }

   static void pancard(String pan, String panregex) {
      if (Pattern.matches(panregex, pan)) {
         System.out.println(pan + " valid pan card number");
      } else {
         System.out.println("invalid pan card number");
      }
   }

   static void extractnum(String wordsstring) {
      Pattern m = Pattern.compile("\\d+");
      Matcher n = m.matcher(wordsstring);
      while (n.find()) {
         System.out.println(n.group());
      }
   }

   static void vowels(String str, String wordregex) {
      Pattern pat = Pattern.compile("[aeiou]");
      Matcher mat = pat.matcher(str);
      int count=0;
      while (mat.find()) {
         count++;
         System.out.println(count);
         // System.out.println(mat.group());
      }
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter email");
      String value = sc.nextLine();
      String regex = "[a-zA-Z0-9]+@[a-zA-Z]+\\.com";
      System.out.println("enter password");
      String pass = sc.nextLine();
      String regex1 =".{8,}"; //"^(?=.*[A-Za-z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,}$";
      System.out.println("enter mobile number");
      String number = sc.nextLine();
      String numregex = "^(\\+91|91)?[6-9]\\d{9}$";

      System.out.println("enter pan card number");
      String pan = sc.nextLine();
      String panregex = "^[a-zA-z]{5}[0-9]{4}[a-zA-Z]$";
      System.out.println("enter words with number");
      String wordsstring = sc.nextLine();
      String wordregex = sc.nextLine();
      System.out.println("enter string with vowels");
      String str = sc.nextLine();
      System.out.println("enter words with space");
      String sentence = sc.nextLine().replaceAll("\\s+", " ");

      email(regex, value);
      password(regex1, pass);
      indianmobile(number, numregex);
      pancard(pan, panregex);
      extractnum(wordsstring);
      vowels(str, wordregex);
      System.out.println(sentence);
      sc.close();
   }
}
// int count
// //Pattern pattern=Pattern.compile("hii");
// Matcher match=Pattern.Matcher(text);
// while(Matcher.find()){

// count++;sop(matcher.start());
// }
