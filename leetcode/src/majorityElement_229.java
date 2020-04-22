//求众数2
//摩尔投票法

import java.util.ArrayList;
import java.util.List;

public class majorityElement_229 {
    public static List<Integer> majorityElement(int[] nums) {
        if (nums.length == 0) {return null;}
        List<Integer> ans = new ArrayList<>();
        int cand1 = nums[0];
        int count1 = 0;
        int cand2 =nums[0];
        int count2 = 0;
        for (int num:nums){
            if (cand1 == num){
                count1++;
                continue;
            }
            if (cand2 == num){
                count2++;
                continue;
            }
            if (count1 == 0){
                cand1 = num;
                count1++;
                continue;
            }
            if (count2 == 0){
                cand2 = num;
                count2++;
                continue;
            }
            count1--;
            count2--;
        }
        count1 = 0;
        count2 = 0;
        for (int num:nums){
            if (cand1 == num){
                count1++;
            } else if (cand2 == num){
                count2++;
            }
        }
        if (count1 > nums.length / 3) {
            ans.add(cand1);
        }
        if (count2 > nums.length / 3) {
            ans.add(cand2);
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,1,3,3,2,2,2};
        List ans = majorityElement(nums);
        System.out.println(ans);
    }
}
