package DSA;
import java.util.*;
public class redo_undo_browser{
class Node{
  String url;
  Node prev,next;
  Node(String url){
    this.url=url;
  }
}
Node current;
void visited(String url){//visited page 
   
  Node newnode=new Node(url);
  
 if(current!=null){ 
    current.next=newnode;//if current not null means  current.next (first node's address)points second node
    newnode.prev=current;
  }//if current null means current points first node that means newnode
    current=newnode;
}
 void previous(){
    if(current.prev!=null){
        System.out.print(" "+current.url);
       current= current.prev;
    }else{
        System.out.println("null");
    }
}void forward(){
    if(current.next!=null){
        System.out.print(" "+current.url);
        current=current.next;

    }else{
        System.out.println("null");
    }
} void display(){
    System.out.println("current page"+current.url);
}public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    redo_undo_browser dll=new redo_undo_browser();
    System.out.println("enter number of operation :");
    // int operation=sc.nextInt();
    // sc.nextLine();//gives new line
    // for(int i=0;i<operation;i++){
    //     String cmd=sc.nextLine();
        // if(cmd.startsWith("visit")){
        //     dll.visited(cmd.split(" ")[1]);
        // }else if(cmd.equals("back")){
        //     dll.previous();
        // }else if(cmd.equals("forward")){
        //     dll.forward();
        // }else{
        //     System.out.println("wrong input ");
        // }
    //}
    
    // String text=sc.nextLine();

    dll.display();sc.close();
}
}
