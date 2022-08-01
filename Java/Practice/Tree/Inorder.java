package Practice.Tree;


// This program is written to find the inorder traversal of a tree. And inorder traversal is a part of DFS...
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left=null;
        this.right = null;
    }
}

public class Inorder {
    public static void inorder(Node root){
        if(root==null) return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        Node left1 = new Node(9);
        Node right1 = new Node(8);
        root.left = left1;
        root.right = right1;
        Node left2 = new Node(7);
        left1.left = left2;
        Node left3 = new Node(6);
        left2.right = left3;
        Node right2 = new Node(5);
        right1.left = right2;
        Node right3 = new Node(12);
        right1.right = right3;
        System.out.println("Inorder : ");
        inorder(root);
    }
}
