//因为队列基于链表构成，LinkedList可以两头操作，所以用一个队列就可以模拟栈，实际上如果想要用栈模拟队列，
// 则必须用两个栈才可以。


import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 76582
 */
public class Mystack {
    Queue<Integer> queue;
    /** Initialize your data structure here. */
    public void MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.remove());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.size() == 0;
    }
}
