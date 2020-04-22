package linkedlists;

/**
 * @author: codeJerry
 * @description: 两个链表的第一个公共节点
 * 输入两个链表，找出它们的第一个公共节点。
 *
 * 在节点 c1 开始相交。
 * @date: 2020/04/11 17:55
 */
public class GetIntersectionNode_52_1 {

    /**
     * 普通长度遍历
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){return null;}
        int lengthA = 1;
        int lengthB = 1;
        ListNode a = headA;
        ListNode b = headB;

        while (a.next != null || b.next != null){
            if (a.next != null){
                a = a.next;
                lengthA++;
            }
            if (b.next != null){
                b = b.next;
                lengthB++;
            }
        }

        if (lengthA >= lengthB){
            headA = find(headA, headB, lengthA - lengthB);
        } else {
            headA = find(headB, headA, lengthB - lengthA);
        }

        return headA;
    }

    ListNode find(ListNode a, ListNode b, int length) {
        while (length != 0) {
            a = a.next;
            length--;
        }
        while (a != null && b != null) {
            if (a == b) {
                return a;
            }
            a = a.next;
            b = b.next;
        }

        return a;
    }


    /**
     * 浪漫相遇
     */
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB){
        if(headA == null || headB == null) {return null;}
        ListNode node1 = headA;
        ListNode node2 = headB;
        int times = 0;
        while (node1 != node2){
            node1 = node1.next != null ? node1.next: headB;
            if(node1 == headB) {
                times++;
                if (times > 2){
                    return null;
                }
            }
            node2 = node2.next != null ? node2.next: headA;
        }
        return node1;
    }
}
