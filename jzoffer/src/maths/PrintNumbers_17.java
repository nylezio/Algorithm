package maths;

/**
 * @author: codeJerry
 * @description:
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 *
 * 示例 1:
 *
 * 输入: n = 1
 * 输出: [1,2,3,4,5,6,7,8,9]
 *
 * 链接：https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof
 * @date: 2020/04/11 19:39
 */
public class PrintNumbers_17 {

    public int[] printNumbers(int n) {
        int sz = fastPow(10,n)-1;
        int[] ans = new int[sz];
        for(int i=0;i<sz;++i){
            ans[i] = i+1;
        }
        return ans;
    }
    public int fastPow(int base, int index){
        int ans = 1;
        while(index > 0){
            if(index%2==1){
                ans*=base;
            }
            index/=2;
            base*=base;
        }
        return ans;
    }
}
