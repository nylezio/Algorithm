package arrays;

import java.util.Arrays;

/**
 * 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 *
 * 链接：https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof
 */
public class PrintMatrix_29 {

    public static int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[]{};
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[] ans = new int[row * col];
        int top = 0;
        int right = col - 1;
        int bottom = row - 1;
        int left = 0;
        int cur = 0;
        while (cur < row * col) {
            for (int i = left; i <= right; i++) {
                ans[cur++] = matrix[top][i];
            }
            if (cur >= row * col) {
                break;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans[cur++] = matrix[i][right];
            }
            if (cur >= row * col) {
                break;
            }
            right--;
            for (int i = right; i >= left; i--) {
                ans[cur++] = matrix[bottom][i];
            }
            if (cur >= row * col) {
                break;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                ans[cur++] = matrix[i][left];
            }
            left++;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1,2},{3,4},{5,6},{7,8},{9,10}};
        int[] ans = spiralOrder(matrix);
        System.out.println(Arrays.toString(ans));
    }
}