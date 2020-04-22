package recurs;

import linkedlists.ListNode;

import java.util.ArrayList;

/**
 * @author: codeJerry
 * @description: 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * @date: 2020/04/14 17:28
 */
public class ReversePrint_06 {
    ArrayList<Integer> arrayList = new ArrayList<>();
    public int[] reversePrint(ListNode head) {
        rescur(head);
        int[] res = new int[arrayList.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = arrayList.get(i);
        }
        return res;

    }
    void rescur(ListNode head){
        if (head == null) {return;}
        rescur(head.next);
        arrayList.add(head.val);
    }
}
