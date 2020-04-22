import java.util.Objects;

/**
 * @author: CHNjerry
 * @date: 2020/03/24 14:58
 * 相同的二叉树
 */
public class IsSameTree_100 {
    private static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null ) {return true;}
        if (p == null || q == null ) {return false;}

        else {
            if (p.val != q.val) {return false;}
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
