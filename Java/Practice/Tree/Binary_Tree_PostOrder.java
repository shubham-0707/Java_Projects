/*

...Binary Tree PostOrder...

 */


package Practice.Tree;
import java.util.*;

public class Binary_Tree_PostOrder {

    public static void postOrder(TreeNode root , ArrayList<Integer> ans){

        if(root==null){
            return;
        }

        postOrder(root.left , ans);
        postOrder(root.right , ans);
        ans.add(root.data);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        postOrder(root , ans);


        // The post-order of the binary tree is :..
        System.out.println("The postOrder is : ");

        for(int i=0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i)+" ");
        }

        // Time Complexity : O(N)
        // Space Complexity : O(1)

    }
}
