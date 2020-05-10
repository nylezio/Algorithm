package monotonoustack;


import java.util.Stack;

/**
 * @author: codeJerry
 * @description: 503. 下一个更大元素 II
 * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。
 * 数字 x的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，
 * 这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1。
 * 输入: [1,2,1]
 * 输出: [2,-1,2]
 * @date: 2020/05/04 16:47
 */
public class NextGreaterElements_503 {

    /**
     * 栈从头扫到尾
     */
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 2 * nums.length; i++) {
            max = Math.max(max, nums[i]);
            while (!stack.isEmpty() && nums[i % nums.length] > nums[stack.peek()]){
                res[stack.pop()] = nums[i % nums.length];
            }
            stack.push(i % nums.length);
        }
        int index = 0;
        while (!stack.isEmpty()){
            index = stack.pop();
            if (nums[index] == max){
                res[index] = -1;
            }
        }

        return res;
    }

    /**
     * 栈从尾扫到头
     */
    public int[] nextGreaterElements2(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        //循环两次
        int times = 2;
        for (int i = times * nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i % nums.length]){
                stack.pop();
            }
            res[i % nums.length] = stack.isEmpty() ? -1 : nums[stack.peek()];
            stack.push(i % nums.length);
        }

        return res;
    }

}
