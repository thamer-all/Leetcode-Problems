public class SameTree_100 {
}

/*
Using recursion

public static boolean sameTree(TreeNode p , TreeNode q){

    if(p == null && q == null) return true;
    if(p == null || q == null) return false;
    if(p.val != q.val)
    return sameTree(p.left,p.right)&& sameTree(q.left,q.right);
    return false;
}

 */
