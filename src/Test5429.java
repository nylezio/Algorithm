import java.util.Arrays;

/**
 * @author: codeJerry
 * @description: 数组中的 k 个最强值
 * 给你一个整数数组 arr 和一个整数 k 。
 *
 * 设 m 为数组的中位数，只要满足下述两个前提之一，就可以判定 arr[i] 的值比 arr[j] 的值更强：
 *
 *  |arr[i] - m| > |arr[j] - m|
 *  |arr[i] - m| == |arr[j] - m|，且 arr[i] > arr[j]
 * 请返回由数组中最强的 k 个值组成的列表。答案可以以 任意顺序 返回。
 *
 * 中位数 是一个有序整数列表中处于中间位置的值。形式上，如果列表的长度为 n ，那么中位数就是该有序列表（下标从 0 开始）中位于 ((n - 1) / 2) 的元素。
 *例如 arr = [6, -3, 7, 2, 11]，n = 5：数组排序后得到 arr = [-3, 2, 6, 7, 11] ，数组的中间位置为 m = ((5 - 1) / 2) = 2 ，中位数 arr[m] 的值为 6 。
 *链接：https://leetcode-cn.com/problems/the-k-strongest-values-in-an-array
 * @date: 2020/06/07 15:03
 */
public class Test5429 {

    public int[] getStrongest(int[] arr, int k) {
        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        Arrays.sort(nums);
        int m = nums[(nums.length - 1) / 2];
        Arrays.sort(nums, (a, b) ->
                Math.abs(a - m) == Math.abs(b - m) ? b - a : Math.abs(b - m) - Math.abs(a - m));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        Test5429 test5429 = new Test5429();
        int[] strongest = test5429.getStrongest(arr, 2);
        System.out.println(Arrays.toString(strongest));
    }
}