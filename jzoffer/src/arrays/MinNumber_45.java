package arrays;

import java.util.Arrays;

/**
 * @author: codeJerry
 * @description: 把数组排成最小的数
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *
 * 输入: [10,2]
 * 输出: "102"
 * @date: 2020/04/13 17:23
 */
public class MinNumber_45 {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (x, y)->(x+y).compareTo(y+x));
        StringBuilder sb = new StringBuilder();
        for (String str: strs
             ) {
            sb.append(str);
        }
        return sb.toString();
    }

}
