package divideandconquers;

/**
 * @author: codeJerry
 * @description: 二叉搜索树与双向链表
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。
 *
 *我们希望将这个二叉搜索树转化为双向循环链表。链表中的每个节点都有一个前驱和后继指针。
 * 对于双向循环链表，第一个节点的前驱是最后一个节点，最后一个节点的后继是第一个节点。
 *
 * 链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof
 * @date: 2020/04/14 15:04
 */
public class TreeToDoublyList_36 {
    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    Node pre, head;
    public Node treeToDoublyList(Node root) {
        if (root == null) {return null;}
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    void dfs(Node cur){
        if (cur == null) {return;}
        dfs(cur.left);
        if (pre!=null) {pre.right = cur;}
        else {head = cur;}
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }
}
