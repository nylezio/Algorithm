package divideandconquers;

import linkedlists.ListNode;

/**
 * @author: codeJerry
 * @description: 合并两个排序的链表
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 链接：https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof
 * @date: 2020/04/14 14:21
 */
public class MergeTwoLists_25 {
    /**
     * 递归
     * @return 链表头
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){return l2;}
        if (l2 == null){return l1;}
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }

    }
}
