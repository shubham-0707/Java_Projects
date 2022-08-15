/*

...Binary Tree preOrder traversal...

 */

package Practice.Tree;
import com.sun.source.tree.Tree;

import java.util.*;


public class Binary_Tree_PreOrder {

    public static void preorder(TreeNode root , ArrayList<Integer> ans){
        if(root==null){
            return;
        }

        ans.add(root.data);
        preorder(root.left , ans);
        preorder(root.right , ans);

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

        ArrayList<Integer> ans = new ArrayList<>();

        preorder(root , ans);

        // the preorder is as :
        System.out.println("The Preorder is as follows : ");
        for(int i=0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i)+" ");
        }

        // Time Complexity : O(N)
        // Space Complexity : O(1)

    }
}
