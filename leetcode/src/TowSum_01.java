//两数之和 用hashmap存储
import java.util.HashMap;
import java.util.Map;

public class TowSum_01 {
    private static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
	// write your code here
        int[] nums = {1,3,5,7,11};
        int target = 12;
        int[] ans = twoSum(nums, target);
        for (int x : ans) {
            System.out.println(x);
        }
    }
}
