import java.util.*;
public class minarrayrecursion {
    //using bultin function
    // static OptionalInt  min(int a[],int size){
    //     return Arrays.stream(a).min();
    // } 
    static int i=0;
    static int c=0;
    static int min(int a[],int size){
        if(size==1 ){
          return a[0];}
        else{
            if(a[size-1]>a[i]){
                c=a[i];
                a[size-1]=c;
            }
        }
        return   min(a,size-1); 
    }
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter size of an array :");
    int size=scan.nextInt();
    System.out.println("enter array elements :");
    int a[]=new int[size];
    for(int i=0;i<size;i++){
       a[i]=scan.nextInt();
    }
    System.out.println(min(a,size));
    scan.close();

}
}