package binarySearch;


interface MountainArray {
    int get(int index);
    public int length();
}
/**
 * @author: codeJerry
 * @description: 山脉数组中查找目标值
 * @date: 2020/04/29 11:06
 */
public class FindInMountainArray_1095 {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len = mountainArr.length();
        int peakIndex = findMountainTop(mountainArr, 0, len - 1);
        if (mountainArr.get(peakIndex) == target){
            return peakIndex;
        }

        int res = findSortedArray(mountainArr, 0, peakIndex - 1, target);
        if (res != -1){
            return res;
        }
        return findReverseArray(mountainArr, peakIndex + 1, len - 1, target);
    }

    private int findReverseArray(MountainArray mountainArr, int left, int right, int target) {
        while (left < right){
            int mid = left + (right - left + 1) / 2;
            if (mountainArr.get(mid) < target){
                //下一轮搜索区间[left, mid - 1]
                right = mid - 1;
            } else {
                //下一轮搜索区间[mid, right]
                left = mid;
            }
        }
        if (mountainArr.get(left) == target){
            return left;
        }
        //left = right;
        return -1;
    }

    /**
     * 查找0 - 山顶元素的目标值，没找到则找后半段
     * @param mountainArr
     * @param left
     * @param right
     * @param target
     * @return
     */
    private int findSortedArray(MountainArray mountainArr, int left, int right, int target) {
        while (left < right){
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < target){
                //下一轮搜索区间[mid + 1, right]
                left = mid + 1;
            } else {
                //下一轮搜索区间[left, mid]
                right = mid;
            }
        }
        if (mountainArr.get(left) == target){
            return left;
        }
        //left = right;
        return -1;
    }

    /**
     * 查找山顶元素
     * @param mountainArr
     * @param left
     * @param right
     * @return
     */
    private int findMountainTop(MountainArray mountainArr, int left, int right) {
        while (left < right){
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)){
                //下一轮搜索区间[mid + 1, right]
                left = mid + 1;
            } else {
                //下一轮搜索区间[left, mid]
                right = mid;
            }
        }
        //left = right;
        return left;
    }
}
