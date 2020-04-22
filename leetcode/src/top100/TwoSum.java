package top100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/17 13:13
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                return res;
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] res = twoSum(nums, 6);
        for (int num :
                res) {
            System.out.println(num);
        }
    }
}
