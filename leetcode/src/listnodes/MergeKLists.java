package listnodes;

/**
 * @author: codeJerry
 * @description: 合并K个排序链表
 * @date: 2020/04/29 14:11
 */


public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        return merge(lists, 0, n - 1);
    }

    private ListNode merge(ListNode[] lists, int left, int right) {
        if (left == right){
            return lists[left];
        }
        if (left > right){
            return null;
        }
        int mid = left + (right - left) / 2;
        return mergeTwoList(merge(lists, left, mid), merge(lists, mid + 1, right));
    }

    private ListNode mergeTwoList(ListNode l, ListNode r) {
        if (l == null){return r;}
        if (r == null){return l;}
        if (l.val < r.val){
                l.next = mergeTwoList(l.next, r);
                return l;
            }
        else {
            r.next = mergeTwoList(l, r.next);
            return r;
        }
    }
}
