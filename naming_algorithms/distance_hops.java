package naming_algorithms;
import java.util.*;
public class distance_hops {
    public static void main(String args[]){
       Scanner scan=new Scanner(System.in);
       int x2=scan.nextInt();
       int y2=scan.nextInt();
       double distance=(int)(Math.sqrt(Math.pow((x2-3),2))+(Math.pow((y2-4),2)));
     int hops=(int)(Math.sqrt(distance));
        System.out.println("no of hops: "+hops );
        scan.close();
    }
}
