import java.util.Stack;

public class QueueWithTwoStacks_09 {
        private Stack<Integer> stack1 = new Stack<Integer>();
        private Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            stack1.push(node);
        }

        public int pop() throws Exception {
            int popVal = 0;
            if (stack2.isEmpty()&&stack1.isEmpty()){
                throw new Exception("there is no value");
            }
            if (!stack2.isEmpty()){
                popVal = stack2.pop();
                System.out.println(popVal);
                return popVal;
            }
            if (stack2.isEmpty() && !stack1.isEmpty()){
                while (!stack1.isEmpty()) {
                    int center = stack1.pop();
                    stack2.push(center);
                }
                popVal = stack2.pop();
                System.out.println(popVal);
            }
            return popVal;
        }
    public static void main(String[] args) throws Exception {
            // write your code here
        QueueWithTwoStacks_09 queueWithTwoStacks_09 = new QueueWithTwoStacks_09();
        queueWithTwoStacks_09.push(1);
        queueWithTwoStacks_09.push(2);
        queueWithTwoStacks_09.push(3);
        int ans1 =  queueWithTwoStacks_09.pop();
        int ans2 =  queueWithTwoStacks_09.pop();
        queueWithTwoStacks_09.push(4);
        int ans3 =  queueWithTwoStacks_09.pop();
        queueWithTwoStacks_09.push(5);
        int ans4 =  queueWithTwoStacks_09.pop();
        int ans5 =  queueWithTwoStacks_09.pop();
    }
}