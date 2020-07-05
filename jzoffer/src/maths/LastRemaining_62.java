package maths;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/06/29 15:41
 */
public class LastRemaining_62 {


    public int lastRemaining(int n, int m) {
        int f = 0;
        for (int i = 2; i <= n; i++) {
            f = (f + m) % i;
            System.out.println(f);
        }
        return f;
    }

    public static void main(String[] args) {
        LastRemaining_62 la = new LastRemaining_62();
        la.lastRemaining(5, 3);
    }
}
