package arrays;

/**
 * @author: codeJerry
 * @description: 统计一个数字在排序数组中出现的次数。
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 * @date: 2020/04/11 14:47
 */
public class Search_53_1 {
    /**
     * 第一种解法
     * 遍历
     */
    public int search(int[] nums, int target) {
        if(nums == null) {return 0;}
        int res = 0;
        for (int num : nums) {
            if (target == num) {
                res++;
            } else if (res > 0) {
                break;
            }
        }
        return res;
    }

    /**
     * 二分查找优化！
     */
    public int search1(int[] nums, int target) {
        if(nums == null || nums.length == 0) {return 0;}
        int right = nums.length - 1;
        int left = 0;
        int mid;
        int res = 0;
        while (left < right){
            mid = left + (right - left) / 2;
            if (nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[right] != target){return 0;}
        else {
            for (int i = right; i < nums.length; i++) {
                if (nums[i] == target){
                    res++;
                } else {
                    break;
                }
            }
            return res;
        }

    }
}
