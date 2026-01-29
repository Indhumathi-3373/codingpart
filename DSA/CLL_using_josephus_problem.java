package DSA;

import java.util.*;

public class CLL_using_josephus_problem {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = this;
        }
    }

    static node head;

    static void insert(int data) {
        node newnode = new node(data);

        if (head == null) {
            head = newnode;
            newnode.next = head;// head -> [1 | next -> head]
            return;
        }
        node tail = head;
        while (tail.next != head) { // head -> [1 | next -> head] false
            tail = tail.next;
        }
        tail.next = newnode;// [1|next->2]->[2|next->head]
        newnode.next = head;
    }

    static void survivor(int n, int k) {
        node current=head;
     while(n>0){
        for(int i=0;i<k;i++){
            
          if(i==k){
             current=current.next.next;
          }current=current.next;
          i=0;
        }
     }
    }

    static void multiple_player(int n, int turn) {// multiple player turn
        if (head == null)
            return;

        node current = head;

        for (int t = 1; t <= turn; t++) {
            System.out.println("Turn " + t + ": Player " + current.data);
            current = current.next; // move to next player

        }
    }

    static void display() {
        node current = head;
        if (current == null) {
            System.out.println("list is empty");
            return;
        }
        do {
            System.out.print("[" + current.data + "] -> ");
            current = current.next;
        } while (current != head);// (while(current != head)) would skip the first node
        System.out.print("[" + head.data + "]");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of nodes :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            insert(sc.nextInt());

        }
        System.out.println("circly linkedlist :");
        display();
        System.out.println("\nenter number of turns :");
        int turn = sc.nextInt();
        multiple_player(n, turn);
        System.out.println("josephus problem enter k element:");//like lucky number
        int k=sc.nextInt();
        survivor(n, k);
        sc.close();
    }
}
