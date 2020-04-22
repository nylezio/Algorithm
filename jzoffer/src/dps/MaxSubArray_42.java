package dps;

/**
 * @author: codeJerry
 * @description: 连续子数组的最大和
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 *
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * 链接：https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof
 * @date: 2020/04/11 20:57
 */
public class MaxSubArray_42 {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){return 0;}
        if(nums.length == 1){return nums[0];}
        int dpPre = nums[0];
        int max = dpPre;
        int dpCur;
        for(int i = 1; i < nums.length; i++){
            dpCur = Math.max(dpPre + nums[i], nums[i]);
            dpPre = dpCur;
            max = Math.max(dpCur, max);
        }
        return max;

    }
}
