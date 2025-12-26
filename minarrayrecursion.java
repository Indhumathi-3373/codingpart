import java.util.*;
public class minarrayrecursion {
    // static OptionalInt  min(int a[],int size){
    //     return Arrays.stream(a).min();
    // } using bultin function
//     static int tem;
//     static int min(int a[],int size){
//         if(size==1){
//             return a[0];
//         }if(a[0]>a[size-1]){
//         return  a[0]
           
//     }return  min(a,size-1);
// }
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter size of an array :");
    int size=scan.nextInt();
    System.out.println("enter array elements :");
    int a[]=new int[size];
    for(int i=0;i<size;i++){
       a[i]=scan.nextInt();
    }
    int c=0;
    // ternary operation
        for(int j=0;j<size-1;j++){
        if(a[j]<a[j+1]){
           c=a[j];
        }
    }System.out.println("minimum element in an array is : "+c);

    // System.out.println(min(a,size));
    scan.close();

}
}