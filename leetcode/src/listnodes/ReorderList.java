package listnodes;

/**
 * @author: codeJerry
 * @description: 重排链表
 * 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 给定链表 1->2->3->4, 重新排列为 1->4->2->3.
 * 链接：https://leetcode-cn.com/problems/reorder-list
 * @date: 2020/04/29 16:42
 */
public class ReorderList {
    public static void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {return;}
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        System.out.println(newHead.val);

        newHead = reverseList(newHead);

        while (newHead != null){
            ListNode temp = newHead.next;
            newHead.next  = head.next;
            head.next = newHead;
            head = newHead.next;
            newHead = temp;
        }

    }

    static ListNode reverseList(ListNode node){
        if (node == null || node.next == null) {return node;}
        ListNode tail = reverseList(node.next);
        node.next.next = node;
        node.next = null;
        return tail;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
//        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        n4.next = n5;
        reorderList(n1);
    }
}
