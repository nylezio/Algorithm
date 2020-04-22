package divideandconquers;

/**
 * @author: codeJerry
 * @description: 数组中出现次数超过一半的数字
 * 摩尔投票
 *
 * @date: 2020/04/14 15:02
 */
public class MajorityElement_39 {

    public int majorityElement(int[] nums) {
        int x = 0, votes = 0;
        for(int num : nums){
            if(votes == 0) {
                x = num;
            }
            votes += num == x ? 1 : -1;
        }
        return x;
    }
}
