import java.util.*;
public class reversingarray {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt();
        int array[]=new int[length];
        for(int i=0;i<array.length;i++){
            System.out.println("enter array element");
           array[i]=scan.nextInt();
        }
        System.out.println("reversing an array :");
        for(int i=length-1;i>=0;i--)
            System.out.print(array[i]);
        System.out.println("minimum element of an array using ternary operator:");
        for(int i=0;i<length-1;i++){
            if(array[i]>array[i+1]){
                
            }
        }
    scan.close();
}    
    
}
