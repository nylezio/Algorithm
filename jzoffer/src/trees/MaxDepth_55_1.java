package trees;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: codeJerry
 * @description:
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，
 * 最长路径的长度为树的深度。
 *
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 *
 * 链接：https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof
 * @date: 2020/04/10 17:22
 */
public class MaxDepth_55_1 {

    public int maxDepth1(TreeNode root) {
        if (root == null) {return 0;}
        return Math.max(maxDepth1(root.left), maxDepth1(root.right)) + 1;
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) {return 0;}
        int res = 0;
        List<TreeNode> queue = new LinkedList<>();
        List<TreeNode> temp;
        queue.add(root);

        while (!queue.isEmpty()){
            temp = new LinkedList<>();
            for (TreeNode node: queue){
                if (node.left != null){temp.add(node.left);}
                if (node.right != null){temp.add(node.right);}

            }
            queue = temp;
            res++;
        }
        return res;
    }
}
