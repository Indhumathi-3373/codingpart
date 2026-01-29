package arrays;
import java.util.Scanner;

public class substring_array {

    public static String getSmallestAndLargest(String s, int k) {
       
       
    int len = s.length() - k + 1;//formula
String arr[] = new String[len];

for (int i = 0; i <= s.length() - k; i++) {
    arr[i] = s.substring(i, i + k);//(0,0+3)executes only 0,1,2
}

String smallest = arr[0];
String largest = arr[0];

for (int i = 1; i < arr.length; i++) {
    if (arr[i].compareTo(smallest) < 0) {
        smallest = arr[i];
    } 
    if (arr[i].compareTo(largest) > 0) {
        largest = arr[i]; 
    }
}
return smallest +"\n"+largest;

    }    
 


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}