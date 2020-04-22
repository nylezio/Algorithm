package arrays;

/**
 * @author: codeJerry
 * @description: 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 *
 * 输入：[3,4,5,1,2]
 * 输出：1
 *
 * 输入：[2,2,2,0,1]
 * 输出：0
 *
 * 链接：https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof
 * @date: 2020/04/11 19:42
 */
public class MinArray_11 {

    /**
     * 二分
     * 无法判断 nums[mid] 在哪个排序数组中，即无法判断旋转点 xx 在 [i, m]
     * 还是 [m + 1, j]区间中。
     * 解决方案： 执行j=j−1 缩小判断范围
     */
    public int minArray(int[] numbers) {
        if(numbers == null || numbers.length == 0) {return 0;}
        int left = 0;
        int right = numbers.length - 1;
        int mid;
        while (left < right){
            mid = left + (right - left) / 2;
            if (numbers[mid] > numbers[right]){
                left = mid + 1;
            } else if (numbers[mid] < numbers[right]){
                right = mid;
            } else {
                right--;
            }
        }

        return numbers[left];

    }
}
