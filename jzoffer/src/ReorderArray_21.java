public class ReorderArray_21 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    private static ListNode ReverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(3);
        ListNode head2 = new ListNode(4);
        ListNode head3 = new ListNode(5);
        head1.next = head2;
        head2.next = head3;
        ListNode head = ReverseList(head1);
        System.out.println(head.val);
    }
}
