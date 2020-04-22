package trees;

/**
 * @author: codeJerry
 * @description: 树的子结构
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 *
 * 例如:
 * 给定的树 A:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * 给定的树 B：
 *
 *    4 
 *   /
 *  1
 * 返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。
 *
 * 链接：https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof
 * @date: 2020/04/10 21:29
 */
public class IsSubStructure_26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {return false;}
        return rescue(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    boolean rescue(TreeNode A, TreeNode B){
        if (B == null){return true;}
        if (A == null || A.val != B.val){return false;}
        return rescue(A.left, B.left) && rescue(A.right, B.right);
    }
}
