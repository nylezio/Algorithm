package greedy;

/**
 * @author: codeJerry
 * @description: 跳跃游戏
 *给定一个非负整数数组，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个位置。
 *
 * 输入: [2,3,1,1,4]
 * 输出: true
 * 解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。
 *
 * 链接：https://leetcode-cn.com/problems/jump-game
 * @date: 2020/04/17 10:45
 */
public class CanJump_55 {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int currMaxP = 0;
        for (int i = 0; i < n; i++) {
            if (i <= currMaxP){
                currMaxP = Math.max(currMaxP, i + nums[i]);
                if (currMaxP >= n - 1){
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
}
