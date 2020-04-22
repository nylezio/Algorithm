/**
 * @author: codeJerry
 * @description: 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次
 * 示例 1:  输入: 1->1->2 输出: 1->2 示例 2:  输入: 1->1->2->3->3 输出: 1->2->3  来
 * 源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date: 2020/04/03 13:40
 */
public class DeleteDuplicates_83 {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;

    }

    public static void main(String[] args) {
        DeleteDuplicates_83 deleteDuplicates_83 = new DeleteDuplicates_83();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        deleteDuplicates_83.deleteDuplicates(head);
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
