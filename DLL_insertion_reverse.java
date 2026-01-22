import java.util.*;
public class DLL_insertion_reverse{
static class node{
    int data;
    node prev;
    node next;
    node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
} static node head;
static node tail;
static void insertnode(int data){
   node newnode=new node(data);
   if(head==null){
    head=newnode;
    tail=newnode; //defaultly next and prev becomes null because of constructor
   
   return; }
   tail.next=newnode;
   newnode.prev=tail;
   tail=newnode;return;
}
static void display(){
    node current=head;System.out.println();
    while(current !=null){
        System.out.print("["+current.prev+"|"+current.data+"|"+current.next+"] -> ");
        current=current.next;
    }System.out.print("null");
}
static void reverse(){
    node current=tail;System.out.println();
    while(current !=null){
        System.out.print(current.data +" ");
        current=current.prev;
    }
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);System.out.println("number of nodes :");
    int n=sc.nextInt();
   for(int i=0;i<n;i++){
insertnode(sc.nextInt());
   }
    System.out.println("\ndoubly linked list :");display();
  System.out.println(" reversed doubly linked list :");reverse();
}
}

