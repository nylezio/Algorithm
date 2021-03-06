package listnodes;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: codeJerry
 * @description: 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
 *
 * 要求返回这个链表的 深拷贝。 
 *
 * 我们用一个由 n 个节点组成的链表来表示输入/输出中的链表。每个节点用一个 [val, random_index] 表示：
 *
 * val：一个表示 Node.val 的整数。
 * random_index：随机指针指向的节点索引（范围从 0 到 n-1）；如果不指向任何节点，则为  null 。
 *  
 * 链接：https://leetcode-cn.com/problems/copy-list-with-random-pointer
 * @date: 2020/04/29 14:57
 */
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class CopyRandomList_138 {
    public Node copyRandomList(Node head) {
        if (head == null) {return head;}
        Map<Node, Node> map = new HashMap<>();
        Node OldNode = head;
        Node newNode = new Node(OldNode.val);
        map.put(OldNode, newNode);

        while(OldNode != null) {
            newNode.next = getCloneNode(map, OldNode.next);
            newNode.random = getCloneNode(map, OldNode.random);

            OldNode = OldNode.next;
            newNode = newNode.next;
        }
        return map.get(head);
    }

    public Node getCloneNode(Map<Node,Node> map, Node node){
        if (node != null) {
            if (!map.containsKey(node)) {
                map.put(node, new Node(node.val));
            }
            return map.get(node);
        }
        return null;
    }
}
