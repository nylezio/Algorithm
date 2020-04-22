package arrays;

/**
 * @author: codeJerry
 * @description: 0～n-1中缺失的数字
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 *
 * 输入: [0,1,3]
 * 输出: 2
 *
 * 输入: [0,1,2,3,4,5,6,7,9]
 * 输出: 8
 *
 * 链接：https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof
 * @date: 2020/04/11 15:12
 */
public class MissingNumber_53_2 {

    public int missingNumber(int[] nums) {
        if(nums == null || nums.length == 0) {return 0;}
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left < right){
            mid = left + (right - left) / 2;
            if (nums[mid] == mid){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        if (right == nums[right]){return nums.length;}
        return right;
        }

}
