package com.example.Tree;



// This program is made to find the preorder of a binary tree...

// Here Node class is already made in the Inorder Traversal..
// that's why we don't need to implement it again and again..



public class Preorder {

    public static void preorder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
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
        System.out.println("PreOrder : ");
        preorder(root);
    }
}
