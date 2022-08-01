package Practice.Tree;


// This program is made to find the postorder of an binary tree...
// Since Node class is already implemented in the Inorder class...
// That's why we don't need to implement it again..
public class Postorder {

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
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
        System.out.println("PostOrder : ");
        postorder(root);
    }
}
