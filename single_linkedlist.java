import java.util.*;

class node {//member class
    int data;
    node address;// java don't have pointers so that we take class name as reference

    node(int data) {
        this.data =data;
        address = null;
    }
}

public class single_linkedlist {
    static node head = null;
    static node tail = null;

    static void insert_data(int x) {
        node newnode = new node(x);// it will send the x value to the constructor by creating an object
        if (head == null) {
            head = newnode;
            tail = newnode;// storing x value in head and tail for very first node
        } else {
            tail.address = newnode;
            tail = newnode; // for moving tail to next node
        }

    }

    static void display() {
        node temp = head;// we are taking class nodes memory as heads space
        while (temp != null) {
            System.out.println(temp.data);
            System.out.println(temp.address);
            temp=temp.address;//travelling next
            // for alternative address printing
            // System.out.println(temp.add.add);
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        while (x>0) {
            
                insert_data(x);
                x = scan.nextInt();
           
        }
        display();// we used static so that no need to create object
        scan.close();
    }
}