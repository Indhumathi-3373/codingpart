 import java.util.*;

public class array_insertion {

public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int []a=new int[n];
    for( int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int pos,ele;
    pos= sc.nextInt();
    if(pos>n){
        System.out.println("Invalid Input");
    }else{
        ele =sc.nextInt();
        System.out.println("Array after insertion is");
        for(int i=0;i<n;i++){
            if(i== pos-1){
              System.out.println(ele);
        }
          System.out.println(a[i]);
    }
    }sc.close();
}
}