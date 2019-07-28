import java.util.*;
public class ValidateTree_98 {

    public class inOrder_94 {

        TreeNode root;
    }
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }
    public static void main(String[] args) {


    }
    public static boolean isBST(TreeNode root){

        Stack<TreeNode> stack = new Stack<TreeNode>();
        double inorder = -Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            stack.pop();

            if (root.val <= inorder)return false;
            inorder = root.val;
            root = root.right;
        }
        return true;
    }
}
