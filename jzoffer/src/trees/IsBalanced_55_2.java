package trees;

/**
 * @author: codeJerry
 * @description:
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
 * 如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。

 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。

 * 链接：https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof
 * @date: 2020/04/10 17:54
 */
public class IsBalanced_55_2 {

    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode root) {
        if (root == null){return 0;}
        int left = recur(root.left);
        if (left == -1){return -1;}
        int right = recur(root.right);
        if (right == -1){return -1;}
        return Math.abs(left - right) < 2 ? Math.max(left,right)+1 : -1;
    }
}