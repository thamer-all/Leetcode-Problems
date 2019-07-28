import java.util.*;

public class postOrder_145 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

    }

    public static void help(TreeNode root, List<Integer> list) {
        if (root != null) {
            if (root.left != null) {
                help(root.left, list);
            }
            list.add(root.val);
        }
        if (root.right != null) {
            help(root.right, list);
        }
        list.add(root.val);
    }

    public static List<Integer> postOrder(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        help(root, list);
        return list;

    }
}