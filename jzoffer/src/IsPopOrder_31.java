import java.util.Stack;

public class IsPopOrder_31 {
    private static boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA == null || popA == null || popA.length == 0 || pushA.length != popA.length){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int length = popA.length;
        int index = 0;
        stack.push(pushA[index++]);
        for (int value : popA) {
            while (value != stack.peek()) {
                if (index == length) {
                    return false;
                }
                stack.push(pushA[index]);
                index++;
            }
            stack.pop();
        }
        return true;
    }
    public static void main(String[] args) {
        // write your code here
        int [] pushA = {1,2,3,4,5};
        int [] popA = {4,3,5,1,2};
        System.out.println(IsPopOrder(pushA, popA));
    }
}
