package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 从上往下打印二叉树
 * @author CodeJerry
 */
public class LevelOrder_32_2 {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        if (root == null){return result;}
        queue.add(root);
        System.out.println(queue.size());
        while (!queue.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            //此处由于queue的长度可能会增长，所以不能采取0-size的++形式
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                ans.add(node.val);
                if (node.left != null){queue.add(node.left);}
                if (node.right != null){queue.add(node.right);}
            }
            result.add(ans);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
