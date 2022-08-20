/*

...Maximum depth using level order traversal...


 */

package Practice.Tree;
import java.util.*;

public class max_depth_using_level_order_traversal {

    public static int max_depth(TreeNode root){

        int depth = 0;
        if(root==null){
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            depth++;
            int num = queue.size();
            for(int i=0; i<num ; i++){
                TreeNode curr = queue.poll();

                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);

            }

        }

        return depth;

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


        System.out.println("The maximum depth of the tree is : "+max_depth(root));
    }
}
