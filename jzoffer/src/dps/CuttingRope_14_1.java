package dps;

/**
 * @author: codeJerry
 * @description: 剪绳子
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m] 。请问 k[0]*k[1]*...*k[m]
 * 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，
 * 此时得到的最大乘积是18。
 *
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1
 *
 * 链接：https://leetcode-cn.com/problems/jian-sheng-zi-lcof
 * @date: 2020/04/11 21:12
 */
public class CuttingRope_14_1 {

    /**
     * dp未优化
     */
    public static int cuttingRope(int n) {
        if (n == 0) {return 0;}
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i < n + 1; i++){
            dp[i] = 0;
            for(int j = 0; j < i; j++){
                dp[i] = Math.max(dp[i], Math.max(dp[i - j] * j, (i - j)*j));
            }
        }
        return dp[n];
    }


    /**
     * 找规律
     */
    public static int cuttingRope1(int n) {
        if (n == 0) {return 0;}
        if (n < 4) {return n - 1;}
        int a = n / 3;
        int b = n % 3;
        if (b == 0){
            return (int) Math.pow(3.0, a);
        } else if (b == 1){
            return (int) Math.pow(3.0, a - 1) * 4;
        } else {
            return (int) Math.pow(3.0, a) * 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(cuttingRope(10));
    }
}

