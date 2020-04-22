package stacks;

import java.util.Stack;

/**
 * @author: codeJerry
 * @description: 包含min函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
 * 调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * @date: 2020/04/14 23:55
 */
public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> helper;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
        helper = new Stack();
    }

    public void push(int x) {
        stack.push(x);
        if (helper.isEmpty()){
            helper.push(x);
        } else {
            if (x <= helper.peek()){
                helper.push(x);
            }
        }
    }

    public void pop() {
        if (!stack.isEmpty()){
            if(stack.peek() <= helper.peek()){
                helper.pop();
            }
            stack.pop();
        } else{
            return;
        }
    }

    public int top() {
        if (!stack.isEmpty()){
            return stack.peek();
        } else{
            return -1;
        }
    }

    public int min() {
        if (!helper.isEmpty()){
            return helper.peek();
        } else{
            return -1;
        }
    }
}
