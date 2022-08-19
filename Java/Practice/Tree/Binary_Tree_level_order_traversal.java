/*

...Binary Tree Level Order Traversal...

 */


package Practice.Tree;
import java.util.*;

public class Binary_Tree_level_order_traversal {

    public static void levelOrder(ArrayList<ArrayList<Integer>> ans , TreeNode root){

        if(root==null){
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            int num = q.size();
            ArrayList<Integer> temp = new ArrayList<>();

            for(int i=0 ; i<num ; i++){

                TreeNode curr = q.poll();

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                temp.add(curr.data);

            }
            ans.add(temp);
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        levelOrder(ans , root);

        System.out.println("The level order traversal is : ");
        for(int i=0 ; i<ans.size() ; i++){
            for(int j=0 ; j<ans.get(i).size() ; j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();

            // Time Complexity : O(N)
            // Space Complexity : O(N)

        }
    }
}
