import java.util.Stack;


public class MinInStack_30 {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    private static void push(int node) {
        stack1.push(node);
        if (stack2.empty() || node < stack2.peek()){
            stack2.push(node);
        } else
            stack2.push(stack2.peek());
    }

    private static void pop() {
        if(stack1.empty() || stack2.empty()){
            return;
        }
        stack1.pop();
        stack2.pop();
    }

    private static int top() {
        int top_node = stack1.peek();
        return top_node;
    }

    private static int min() {
        int min_node = stack2.peek();
        return min_node;
    }

    public static void main(String[] args) {
    push(3);
    int minn = min();
        System.out.println(minn);
    }
}
