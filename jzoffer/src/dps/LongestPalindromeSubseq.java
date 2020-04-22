package dps;

/**
 * @author: codeJerry
 * @description: 最长回文子序列
 * @date: 2020/04/21 19:38
 */
public class LongestPalindromeSubseq {

    public static int longestPalindromeSubseq(String s){
        int len = s.length();
        int [][] dp = new int[len][len ];
        for (int i = len - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < len; j++) {
                System.out.println(i + ","+ j);
                if (s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i + 1][j - 1] + 2;

                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][len - 1];
    }

    public static void main(String[] args) {
        String s = "bbbab";
        int res = longestPalindromeSubseq(s);
        System.out.println(res);
    }
}
