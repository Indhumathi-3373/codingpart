import java.util.*;
public class rotatingarray {
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.println("how many times it has to rotate?");
    int rotate=scan.nextInt();
    System.out.println("enter array size :");
    int size=scan.nextInt();
    int arr[]=new int[size];
    System.out.println("enter array element :");
    for(int i=0;i<size;i++){
        arr[i]=scan.nextInt();
    }
    
    for(int j=0;j<rotate;j++){
    for(int i=1;i<size;i++){
        
        System.out.print(arr[i]);
        
    }System.out.print(arr[j]);
}
scan.close();
}
    
}

