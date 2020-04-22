package arrays;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/14 23:00
 */
public class Exchange_21 {

    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 == 1) {
                left++;
            }
            while (right > left && nums[right] % 2 == 0) {
                right--;
            }

            swap(nums, left, right);
        }
        return nums;
    }

    void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
