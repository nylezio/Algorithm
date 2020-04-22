package stacks;

import java.util.Stack;

/**
 * @author: codeJerry
 * @description: 用两个栈实现队列
 * @date: 2020/04/14 17:38
 */
public class CQueue {
    Stack<Integer> data;
    Stack<Integer> helper;

    public CQueue() {
        data = new Stack<>();
        helper = new Stack<>();
    }

    public void appendTail(int value) {
        data.push(value);
    }

    public int deleteHead() {
        if (!helper.isEmpty()){
            return helper.pop();
        } else {
            if (data.isEmpty()){
                return -1;
            }
            while (!data.isEmpty()){
                helper.push(data.pop());
            }
        }
        return helper.pop();
    }
}
