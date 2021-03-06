package people;


/**
 * @author: codeJerry
 * @description:
 * 小朋友 A 在和 ta 的小伙伴们玩传信息游戏，游戏规则如下：
 *
 * 有 n 名玩家，所有玩家编号分别为 0 ～ n-1，其中小朋友 A 的编号为 0
 * 每个玩家都有固定的若干个可传信息的其他玩家（也可能没有）。传信息的关系是单向的（比如 A 可以向 B 传信息，但 B 不能向 A 传信息）。
 * 每轮信息必须需要传递给另一个人，且信息可重复经过同一个人
 * 给定总玩家数 n，以及按 [玩家编号,对应可传递玩家编号] 关系组成的二维数组 relation。返回信息从小 A (编号 0 ) 经过 k 轮传递到编号为 n-1 的小伙伴处的方案数；若不能到达，返回 0。
 *
 * 输入：n = 5, relation = [[0,2],[2,1],[3,4],[2,3],[1,4],[2,0],[0,4]], k = 3
 *
 * 输出：3
 * @date: 2020/04/18 15:21
 */
public class TransitionInformation {
    public int numWays(int n, int[][] relation, int k) {
        int[][] dp = new int[n][k+1];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k + 1; j++) {
                dp[i][j] = 0;
            }
        }

        for (int[] value : relation) {
            if (value[0] == 0) {
                dp[value[1]][1] = 1;
            }
        }

        for (int j = 2; j < k + 1; j++) {
            for (int[] ints : relation) {
                dp[ints[1]][j] += dp[ints[0]][j - 1];
            }
        }

        return dp[n - 1][k];

}
}
