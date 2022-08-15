/*

...Binary Tree Representation...

 */

package Practice.Tree;
import java.util.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        left = null;
        right = null;
    }

}

public class Binary_Tree_representation {

    public static void preorder(TreeNode root , List<Integer> ans){
        if(root==null){
            return;
        }
        ans.add(root.data);
        preorder(root.left , ans);
        preorder(root.right , ans);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(24);
        root.left = new TreeNode(23);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(12);
        root.left.right = new TreeNode(15);

        List<Integer> ans = new ArrayList<>();
        preorder(root , ans);


        // The preorder of the tree is :
        System.out.println("The preorder of the tree is : ");
        for(int i=0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i)+" ");
        }


        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
