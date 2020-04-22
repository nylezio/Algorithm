package trees;

/**
 * @author: codeJerry
 * @description:
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 *
 *运用中序遍历的倒叙搜索
 * @date: 2020/04/10 17:14
 */
public class kthLargest_54 {
    int res;
    int k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root){
        if (root == null) {return;}
        dfs(root.right);
        if (k == 0){return;}
        if (--k == 0){res = root.val;}
        dfs(root.left);
    }
}
