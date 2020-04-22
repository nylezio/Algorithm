package arrays;

/**
 * @author: codeJerry
 * @description: 二维数组中的查找
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 5 true
 *
 * 链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
 * @date: 2020/04/11 13:08
 */
public class FindNumberIn2DArray_04 {

    public boolean find(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {return false;}
        int raws = matrix.length, cols = matrix[0].length;
        int raw = 0, col = cols - 1;
        while (raw < raws && col >= 0){
            int num = matrix[raw][col];
            if (num == target){return true;}
            else if(num > target){col--;}
            else {raw++;}
        }
        return false;
    }
}
