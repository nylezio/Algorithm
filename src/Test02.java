import java.util.Arrays;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/06/07 18:07
 */
public class Test02 {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            while(nums[i] != i){
                if (nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        Test02 test02 = new Test02();
        int repeatNumber = test02.findRepeatNumber(nums);
        System.out.println(repeatNumber);

    }
}
