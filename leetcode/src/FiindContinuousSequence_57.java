//面试题57 - II. 和为s的连续正数序列
//滑动窗口实现

import java.util.ArrayList;
import java.util.List;

public class FiindContinuousSequence_57 {

    public static int[][] findContinuousSequence(int target) {
        List<int[]> ans = new ArrayList<>();
        int currentA = 1;
        int currentB = 1;
        int sum = 0;
        while (currentA <= target / 2) {
            if (sum < target){
                sum += currentB;
                currentB++;
            }
            else if (sum > target){
                sum -= currentA;
                currentA++;
            }
            else {
                int [] arr = new int[currentB-currentA];
                for (int j = currentA; j < currentB; j++){
                    arr[j-currentA]=j;
                }
                ans.add(arr);
                sum-=currentA;
                currentA++;
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int target = 9;
       findContinuousSequence(target);
    }
}
