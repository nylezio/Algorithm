package linkedlists;

/**
 * @author: codeJerry
 * @description: 删除链表的节点
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 *
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 *
 * 链接：https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof
 * @date: 2020/04/11 15:59
 */
public class DeleteNode_18 {

    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {return null;}
        if (head.val == val){
            if (head.next!=null) {return head.next;}
            else {return null;}
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null && cur.val != val){
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) {pre.next = cur.next;}
        return head;
    }

}
