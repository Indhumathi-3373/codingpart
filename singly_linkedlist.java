import java.util.*;

  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }public class singly_linkedlist{
        static Node head=null;
    static Node insert(int data){//inserting at end like 10 after that 20 (10,20...)
      
        Node newnode=new Node(data);//this node obj sends data to constructor
        if(head==null){ 
            head=newnode; // we points the newnode reference to the head if newnode is [data|null] head points like this head->[data|null]
            return head; //program stops here if head is null 
        }else{ 
            Node temp=head;  //we are pointing temp->head that means temp->[data|null] 
            while(temp.next!=null){ //here temp.next refers the null which is in [data|null] then condition fails
               temp=temp.next;//if condition passed means temp will point to each every node untill last node because last node has null as address 
            }
            temp.next=newnode;//now im pointing the [data|null (this)] that mean null will store the reference of next node eg:first node[20|.] . points 30's address 
        }return head;//head wont change because this will be the entry point thats why i returned this.
    } 
    static void display(){
      Node temp=head;
      while(temp!=null){
        System.out.print("[ "+temp.data+"|"+temp.next+" ]"+" -> ");
        temp=temp.next;
      }System.out.print("NULL");
    }

    public static void main(String[] args){
  
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number of nodes :");
  int n=sc.nextInt();
  System.out.println("enter node elements :");int count=0;
for(int i=0;i<n;i++){
    
    insert(sc.nextInt());count++;
}
System.out.println("singly linked list :");
display();
System.out.println("total number of train coaches : "+count);
    }

}