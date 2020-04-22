package dps;

/**
 * @author: codeJerry
 * @description: 股票的最大利润
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 *
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 *
 * 链接：https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof
 * @date: 2020/04/12 20:50
 */
public class MaxProfit_63 {
    /**
     * dp
     * @param prices 股票价格
     * @return 最大收益
     */
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) {return 0;}
        int pre = 0;
        int cur = 0;
        int min = prices[0];
        for(int i = 1; i < n; i++){
            cur = Math.max(pre, prices[i] - min);
            min = Math.min(min , prices[i]);
            pre = cur;
        }
        return cur;
    }
}
