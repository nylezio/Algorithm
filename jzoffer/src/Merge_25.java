public class Merge_25 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    private static ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null){
            return list1;
        }
        ListNode head = null;

        if (list1.val < list2.val){
            head = list1;
            head.next = Merge(list1.next, list2);
        }else {
            head = list2;
            head.next = Merge(list1, list2.next);
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(3);
        ListNode head2 = new ListNode(4);
        ListNode head3 = new ListNode(5);
        head1.next = head2;
        head2.next = head3;
        ListNode head4 = new ListNode(1);
        ListNode head5 = new ListNode(5);
        ListNode head6 = new ListNode(6);
        head4.next = head5;
        head5.next = head6;
        ListNode head = Merge(head1, head4);
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }

    }
}
