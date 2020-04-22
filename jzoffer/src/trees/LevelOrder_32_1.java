package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 从上往下打印二叉树
 * @author CodeJerry
 */
public class LevelOrder_32_1 {

    public static int[] levelOrder(TreeNode root) {
        if (root == null) {return new int[0];}
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null){queue.add(node.left);}
            if (node.right != null){queue.add(node.right);}
        }


        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;

    }

    public static void main(String[] args) {

    }
}
