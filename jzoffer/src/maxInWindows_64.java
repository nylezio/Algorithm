import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 滑动窗口的最大值
 */

public class maxInWindows_64 {
    private static Queue<Integer> queue = new ArrayDeque<>();
    public static ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> list = new ArrayList<>();
        if (num == null || num.length < size){
            return list;
        }

        int length = num.length;
        for (int i = 0; i < length; i++){
            queue.offer(num[i]);
            if (queue.size() == size){
                int maxValue = 0x80000000;
                for (Integer number : queue){
                    if (maxValue < number){
                        maxValue = number;
                    }
                }
                list.add(maxValue);
                System.out.println(queue + ":" + maxValue);
                queue.poll();
            }
        }
        return list;
    }

    public static void main(String[] args) {
    int size =3;
    int [] num = {1,3,-1,-3,5,3,6,7};
        System.out.println(maxInWindows(num, 3));
    }

}
