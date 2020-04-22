package arrays;

import java.util.ArrayList;

public class PrintMatrix_29 {
    private static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0){
            return result;
        }
        int start = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        while (rows > start * 2 && cols > start * 2){
            int endX = cols - 1 - start;
            int endY = rows - 1 - start;
            for (int i = start; i <= endX; i++) {
                result.add(matrix[start][i]);
            }
            if (start < endY){
                for (int i = start + 1; i <= endY; i++) {
                    result.add(matrix[i][endX]);
                }
            }
            if (start < endX && start < endY){
                for (int i = endX - 1; i >= start; i--) {
                    result.add(matrix[endY][i]);
                }
            }
            if (start < endX && start < endY - 1){
                for (int i = endY - 1; i >= start + 1; --i) {
                    result.add(matrix[i][start]);
                }
            }
            ++start;
        }
        return result;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1,2},{3,4},{5,6},{7,8},{9,10}};
        ArrayList res = printMatrix(matrix);
        System.out.println(res);
    }
}