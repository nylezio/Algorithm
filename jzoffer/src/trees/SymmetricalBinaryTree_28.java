package trees;

/**
 * @author CodeJerry
 * @description: 对称二叉树
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 * 链接：https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof
 */
public class SymmetricalBinaryTree_28 {

    private static boolean isSymmetric(TreeNode root){
        if (root == null){return true;}
        return recur(root.left, root.right);
    }

    private static boolean recur(TreeNode lRoot, TreeNode rRoot){
        if (lRoot == null && rRoot == null){
            return true;
        }
        if (lRoot == null || rRoot == null || lRoot.val != rRoot.val){
            return false;
        }
        return recur(lRoot.left, rRoot.right) && recur(lRoot.right, rRoot.left);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(8);
        TreeNode root2 = new TreeNode(6);
        TreeNode root3 = new TreeNode(6);
        TreeNode root4 = new TreeNode(5);
        TreeNode root5 = new TreeNode(7);
        TreeNode root6 = new TreeNode(7);
        TreeNode root7 = new TreeNode(5);
        root1.left = root2;
        root1.right = root3;
        root2.left = root4;
        root2.right = root5;
        root3.left = root6;
        root3.right = root7;
        boolean sym = isSymmetric(root1);
        System.out.println(sym);
    }
}