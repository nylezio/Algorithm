package linkedlists;

/**
 * @author: codeJerry
 * @description: 反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * 链接：https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof
 *
 * @date: 2020/04/11 16:36
 */
public class ReverseList_24 {
    /**
     * 递归解法
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {return head;}
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        //防止链表循环，需要将head.next设置为空
        head.next = null;
        //每层递归函数都返回cur，也就是最后一个节点
        return cur;
    }

    /**
     * 遍历解法
     */
    public ListNode reverseList1(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;

        }
        return pre;
    }
}
