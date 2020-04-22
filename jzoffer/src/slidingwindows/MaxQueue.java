package slidingwindows;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: codeJerry
 * @description: 队列的最大值
 * 请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
 *
 * 若队列为空，pop_front 和 max_value 需要返回 -1
 *
 * 输入:
 * ["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
 * [[],[1],[2],[],[],[]]
 * 输出: [null,null,null,2,1,2]
 *
 * 链接：https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof
 * @date: 2020/04/13 18:39
 */
public class MaxQueue {
    Queue<Integer> queue;
    Deque<Integer> deque;

    public MaxQueue() {
        this.queue = new LinkedList<>();
        this.deque = new LinkedList<>();
    }

    public int max_value() {
        if (!deque.isEmpty()){
            return deque.peek();
        } else {
            return -1;
        }
    }

    public void push_back(int value) {
        queue.offer(value);
        while (deque.size() > 0 && deque.peekLast() < value){
            deque.pollLast();
        }
        deque.offer(value);
    }

    public int pop_front() {
        int poll = queue.size() > 0 ? queue.poll():-1;
        if (deque.size()>0 && poll == deque.peek()){
            deque.pollFirst();
        }
        return poll;
    }
}
