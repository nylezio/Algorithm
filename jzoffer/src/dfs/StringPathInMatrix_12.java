package dfs;

//矩阵中的路径
public class StringPathInMatrix_12 {
    private static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        int[] flag = new int[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(matrix, rows, cols, i, j, str, 0, flag)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
        int index = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || flag[index] == 1) {
            return false;
        }
        if(k == str.length - 1) {
            return true;
        }
        flag[index] = 1;
        if (dfs(matrix, rows, cols, i - 1, j, str, k + 1, flag)
                || dfs(matrix, rows, cols, i + 1, j, str, k + 1, flag)
                || dfs(matrix, rows, cols, i, j - 1, str, k + 1, flag)
                || dfs(matrix, rows, cols, i, j + 1, str, k + 1, flag)) {
            return true;
        }
        flag[index] = 0;
        return false;
    }

    public static void main(String[] args) {
        char[] matrix = {'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'};
        int rows = 3;
        int cols = 4;
        char[] str= {'b', 'c', 'c', 'e', 'd'};
        boolean find = false;
        find = hasPath(matrix, rows, cols, str);
        System.out.println(find);
    }
}
