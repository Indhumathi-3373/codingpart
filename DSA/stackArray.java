package DSA;
import java.util.*;

public class stackArray {
    static Scanner sc=new Scanner(System.in);
    int stack[];
   static int size;
   int top=-1;
   stackArray(){
    size =sc.nextInt();
    stack=new int[size];
   }
   void push(int element){
      if(top==size-1){
        System.out.println("stack overflow");
        return;
      }
      stack[++top]=element;
   }
   int pop(int times){
    if(top==-1){
        System.out.println("stack underflow");return -1;
    }
    return stack[top--];
   }
   void display(){

   }
    public static void main(String args[]){
        stackArray s=new stackArray();
        for(int i=0;i<size;i++){
        s.push(sc.nextInt());
        }
       
        sc.close();
    }
}
