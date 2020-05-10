package dp;

/**
 * @author: codeJerry
 * @description: 最大正方形
 * 在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
 * 示例:  输入:   1 0 1 0 0 1 0 1 1 1 1 1 1 1 1 1 0 0 1 0
 * 输出: 4
 * 链接：https://leetcode-cn.com/problems/maximal-square
 * @date: 2020/05/08 11:49
 */
public class MaxSquare {
    public static void main(String[] args) {
        char[][] matrix = new char[][]{{'1', '0','1','0','0'}, {'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        int max = MaxSquare.maximalSquare(matrix);
        System.out.println(max);
    }

    public static int maximalSquare(char[][] matrix) {
        int max= 0;
        if ( matrix.length == 0){
            return 0;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];

        for (int i = 0; i < row; i++){
            if (matrix[i][0] == '1'){
                dp[i][0] = 1;
                max = 1;
            } else {
                dp[i][0] = 0;
            }
        }
        for (int i = 0; i < col; i++){
            if (matrix[0][i] == '1'){
                dp[0][i] = 1;
                max = 1;
            } else {
                dp[0][i] = 0;
            }
        }
        for(int i = 1;i < row; i++){
            for(int j = 1; j < col; j++){
                if (matrix[i][j] == '1'){
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    max = Math.max(dp[i][j], max);
                }
            }
        }
        return max * max;
    }
}
