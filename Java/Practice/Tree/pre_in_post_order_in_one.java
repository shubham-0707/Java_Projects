/*

...In this question we are going to find out preorder , inorder and postorder all in one single code...

 */


package Practice.Tree;
import javafx.util.*;
import java.util.*;




public class pre_in_post_order_in_one {
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

        ArrayList<Integer> preorder = new ArrayList<>();
        ArrayList<Integer> inorder = new ArrayList<>();
        ArrayList<Integer> postorder = new ArrayList<>();

        Stack<Pair<TreeNode , Integer>> st = new Stack<>();
        st.push(new Pair(root , 1));

        while(!st.isEmpty()){
            Pair temp = st.pop();

            if((int) temp.getValue()==1){
                TreeNode node = (TreeNode)temp.getKey();
                preorder.add(node.data);
                int num = (int)temp.getValue();
                num++;
                st.push(new Pair(node , num));

                if(node.left!=null){
                    st.push(new Pair(node.left , 1));
                }
            }

            else if((int)temp.getValue()==2){
                int num = (int) temp.getValue();
                TreeNode node = (TreeNode)temp.getKey();
                inorder.add(node.data);
                num++;
                st.push(new Pair(node , num));

                if(node.right!=null){
                    st.push(new Pair(node.right , 1));
                }
            }

            else{
                TreeNode node = (TreeNode) temp.getKey();
                postorder.add(node.data);
            }
        }

        // printing the preorder..
        System.out.println("PreOrder : ");
        for(int i=0 ; i<preorder.size() ; i++){
            System.out.print(preorder.get(i)+" ");
        }
        System.out.println();

        //printing the inorder...
        System.out.println("Inorder is : ");
        for(int i=0 ; i<inorder.size() ; i++){
            System.out.print(inorder.get(i)+" ");
        }
        System.out.println();

        // printing the postorder...
        System.out.println("Postorder is : ");
        for(int i=0 ; i<postorder.size() ; i++){
            System.out.print(postorder.get(i)+" ");
        }


        // Time Complexity : O(3*N) =~ O(N)
        // Space Complexity : O(N)

    }
}
