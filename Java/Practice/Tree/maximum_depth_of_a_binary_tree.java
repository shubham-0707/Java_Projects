/*

...maximum depth of a binary tree...

 */


package Practice.Tree;
import java.util.*;

public class maximum_depth_of_a_binary_tree {

    public static int max_depth(TreeNode root){
        if(root==null){
            return 0;
        }

        return 1+Math.max(max_depth(root.left) , max_depth(root.right));
    }

    public static void main(String[] args) {


        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.left= new TreeNode(9);
        root.right.right.right = new TreeNode(10);


        System.out.println("The maximum depth is : "+max_depth(root));

    }

}
