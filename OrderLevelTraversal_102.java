import com.sun.source.tree.Tree;

import java.util.*;

public class OrderLevelTraversal_102 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list= new ArrayList<List<Integer>>();
        ArrayList<Integer> res = new ArrayList<>();
        help(root,res);
        list.add(res);
        return list;
    }

    public void help(TreeNode root , List<Integer> list){
        if (root != null){
            list.add(root.val);
            if (root.left!= null){
                help(root.left, list);
            }
            if (root.right != null){
                help(root.right, list);
            }
        }
    }
}
