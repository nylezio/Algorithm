package recurs;

/**
 * @author: codeJerry
 * @description: 青蛙跳台阶问题
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 链接：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof
 * @date: 2020/04/10 22:56
 */
public class NumWays_10_2 {
    public int numWays(int n) {
        if (n == 0 || n == 1) {return 1;}
        if (n == 2) {return 2;}
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }
}
