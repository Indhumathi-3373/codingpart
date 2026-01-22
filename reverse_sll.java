import java.util.Scanner;

class node{
        int data ;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
public class sll_head_tail{
    static node head = null;
    static node tail = null;
    static void insert(int data){
        node newnode = new node(data);
        if (head==null){
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    static void display(){
        
        node temp = head;
        while (temp !=null){
            System.out.print(temp.data);
            
            temp = temp.next;
            System.out.print(" -> ");
        }
        System.out.println();
            
    }
   static void reverse(node temp) {
    if (temp == null) {
        return;
    }
    reverse(temp.next);
    System.out.print(temp.data + " ");
}

    static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            print("enter number of nodes");
            while (num >0){
                insert(num);
                num = scan.nextInt();
            }
            System.out.println("original nodes ");
        display();
        System.out.println("reversed nodes ");
        reverse(head);
    }
}