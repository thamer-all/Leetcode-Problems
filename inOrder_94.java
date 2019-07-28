import java.util.*;

public class inOrder_94 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

    public static void main(String[] args) {

      //  inorder


    }
    public static void help(TreeNode root, List<Integer> list ){
        if (root != null){
            if (root.left != null){
                help(root.left,list);
            }
           list .add(root.val);
        }
        if (root.right!= null){
            help(root.right,list);
        }
    }
    public static  List<Integer> inorder(TreeNode root){

        List<Integer> list  =new ArrayList<>();
        help(root,list);
        return list;

    }


}

