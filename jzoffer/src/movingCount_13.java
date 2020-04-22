//递归
//机器人的运动范围
public class movingCount_13 {
    public static int movingCount(int threshold, int rows, int cols)
    {
        int [][] visited = new int[rows][cols];
        return moving(rows, cols, 0, 0, visited, threshold);
    }
    private static int moving(int raws, int cols, int i, int j, int [][] visited, int threshold){
        if (i < 0 || j < 0 || i >= raws || j >= cols || visited[i][j] == 1 || numsum(i) + numsum(j) > threshold) {
            return 0;
        }
        visited[i][j] = 1;
        return 1 + moving(raws, cols, i - 1, j, visited, threshold)
                + moving(raws, cols, i + 1, j, visited, threshold)
                + moving(raws, cols, i , j - 1, visited, threshold)
                + moving(raws, cols, i , j + 1, visited, threshold);
    }
    private static int numsum(int i){
        int sum = 0;
        while (i !=0){
            sum+= i%10;
            i/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int k = 3;
        int raws = 3;
        int cols = 3;
        int count = movingCount(k , raws, cols);
        System.out.println(count);
    }
}
