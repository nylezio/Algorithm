package listnodes;

import listnodes.ListNode;

import java.util.Stack;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/29 23:32
 */
public class MonotonousStack {

    public int[] nextLargerNodes(ListNode head) {
        if (head == null) {return new int[]{};}
        int[] res = new int[10000];

        int[] nums = new int[10000];


        int length = 0;

        Stack<Integer> stack = new Stack<>();

        while (head != null){
            int value = head.val;
            nums[length] = value;

            while (!stack.isEmpty() && nums[stack.peek()] < value){
                res[stack.pop()] = value;

            }
            stack.add(length);
            length++;
            head = head.next;
        }
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = res[i];
        }
        return result;

    }
}
