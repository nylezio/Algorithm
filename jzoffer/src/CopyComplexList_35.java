public class CopyComplexList_35 {
    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public static RandomListNode clone(RandomListNode pHead)
    {
        clone_next(pHead);
        clone_random(pHead);
        RandomListNode qHead = spilt_list(pHead);
        return qHead;
    }
    public static void clone_next(RandomListNode pHead){
        RandomListNode p = pHead;
        while (p != null){
            RandomListNode q = new RandomListNode(p.label);
            q.next = p.next;
            p.next = q;
            p = q.next;
        }
    }
    public static void clone_random(RandomListNode pHead){
        RandomListNode p = pHead;
        while (p != null){
//            RandomListNode q = p.next;
            if (p.random != null){
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }
    }
    public static RandomListNode spilt_list(RandomListNode pHead){
        RandomListNode s = new RandomListNode(0);
        RandomListNode s1 = s;
        while (pHead != null){
            RandomListNode q = pHead.next;
            pHead.next = q.next;
            s.next = q;
            s = s.next;
            pHead = pHead.next;
        }
        return s1.next;
    }


    public static void main(String[] args) {
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        node1.next = node2;
        node2.next = node3;
        node1.random = node3;
        RandomListNode test = clone(node1);
        while (test != null){
            System.out.println(test.label);
            test = test.next;
        }

    }
}
