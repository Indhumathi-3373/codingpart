package DSA;

class binarytree{
static class node{
  int data;
    node right, left;
   node(int data){
        this.data=data;
        left=right= null ;
    }
}
public void inorder(node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.println(root.data+" ");
    inorder(root.right);
}//4 2 5 1 3 6 
public void preorder(node root){
    if(root==null){
        return;
    }System.out.println(root.data+" ");
    preorder(root.left);
    preorder(root.right);
}//1 2 3 4 5 3 6 
public void postorder(node root){
    if(root==null){
        return;
    }
    
    postorder(root.left);
    postorder(root.right);System.out.println(root.data+"");
}//4 5 2 6 3 1
  public static void main(String args[]){
    node root=new node(1);
    root.left=new node(2);
    root.right=new node(3);
    root.left.left=new node(4);
    root.left.right=new node(5);
    root.right.right=new node(6);
    
  }

}

