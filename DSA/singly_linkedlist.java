package DSA;
import java.util.*;

public class singly_linkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static Node insert(int data) {// inserting at end like 10 after that 20 (10,20...)

        Node newnode = new Node(data);// this node obj sends data to constructor
        if (head == null) {
            head = newnode; // we points the newnode reference to the head if newnode is [data|null] head
                            // points like this head->[data|null]
            return head; // program stops here if head is null
        } else { // here temp is acting as tail
            Node temp = head; // we are pointing temp->head that means temp->[data|null]
            while (temp.next != null) { // here temp.next refers the null which is in [data|null] then condition fails
                temp = temp.next;// if condition passed means temp will point to each every node untill last node
                                 // because last node has null as address
            }
            temp.next = newnode;// now im pointing the [data|null (this)] that mean null will store the
                                // reference of next node eg:first node[20|.] . points 30's address
        }
        return head;// head wont change because this will be the entry point thats why i returned
                    // this.
    }

    static void display() {
        System.out.println("singly linked list :");
        Node temp = head;
        while (temp != null) {
            System.out.print("[ " + temp.data + " ]" + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");

    }

    static void displaydeletednode() {
        Node cur = head;
        while (cur != null) {
            System.out.print("[" + cur.data + "] -> ");
            cur = cur.next;
        }
        System.out.print("null");
    }

    static void deletebyvalue(int del) {

        if (head == null)
            return;
        if (head.data == del) {
            head = head.next; // head->[10|next->20]
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != del) {
            current = current.next;
        }
        current.next = current.next.next;                      
    }
    static void deletebyposition(int pos,int n){
        
        if( pos>n || pos<1){
            System.out.println("invalid position");
            return;
        }
        if(pos==1){
         head=head.next;return;
        }Node current=head.next;//current->[2|next->3]
           for(int i=2;i<=pos;i++){
            if(pos==2){
                current=current.next.next;
            }
           current=current.next;
           }
        
    }
    static void displaydeletebyposition(){
        Node cur=head;
        while(cur!=null){
            System.out.print("[ " + cur.data + " ] -> ");
            cur=cur.next;
        } System.out.print("null");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("enter number of nodes :");
        // int n=sc.nextInt();
        System.out.println("enter node elements :");
        int count = 0;
        for (int i = 0; i < 5; i++) {

            insert(sc.nextInt());
            count++;
        }

        display();
        // System.out.println("\nenter value for delete a node by value");
        // int del = sc.nextInt();
        // deletebyvalue(del);
        // displaydeletednode();
        System.out.println("\n enter position for deleting a node");
        int pos=sc.nextInt();
        deletebyposition(pos, 5);
        displaydeletebyposition();
        System.out.println("\ntotal number of train coaches : " + count);
        sc.close();
    }
}