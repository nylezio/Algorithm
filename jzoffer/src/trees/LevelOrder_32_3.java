package trees;

import java.util.*;

/**
 * 从上往下打印二叉树
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，
 * 第三行再按照从左到右的顺序打印，其他行以此类推。
 * @author CodeJerry
 */
public class LevelOrder_32_3 {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        if (root == null){return result;}
        deque.add(root);
        while (!deque.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            //此处由于queue的长度可能会增长，所以不能采取0-size的++形式
            for (int i = deque.size(); i > 0; i--) {
                TreeNode node = deque.removeFirst();
                ans.add(node.val);
                if (node.left != null){deque.addLast(node.left);}
                if (node.right != null){deque.addLast(node.right);}
            }
            result.add(ans);
            if (deque.isEmpty()){break;}
            ans = new ArrayList<>();
            for (int i = deque.size(); i > 0; i--) {
                TreeNode node = deque.removeLast();
                ans.add(node.val);
                if (node.right != null){deque.addFirst(node.right);}
                if (node.left != null){deque.addFirst(node.left);}
            }
            result.add(ans);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
