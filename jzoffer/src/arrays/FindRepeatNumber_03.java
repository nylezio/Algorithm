package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: codeJerry
 * @description: 数组中重复的数字
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 *
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * @date: 2020/04/11 12:34
 */
public class FindRepeatNumber_03 {
    /**
    *最优
    */
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i){
                if (nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                swap(nums, i, nums[i]);
            }
        }
        return -1;
    }
    private static void swap(int[] nums, int i, int j){
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }

    /**
     * 运用Set
     * @param nums 数组0～n-1范围
     * @return repeat
     */
    private int findRepeatNum1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }
}
