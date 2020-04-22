package recurs;

/**
 * @author: codeJerry
 * @description: 递归之：斐波那契数列
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 *
 * 链接：https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof
 * @date: 2020/04/10 22:44
 */
public class Fib_10_1 {
    public static int fib(int n) {
        if (n == 0) {return 0;}
        if (n == 1) {return 1;}
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
