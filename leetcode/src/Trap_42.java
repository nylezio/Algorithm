import java.util.Stack;

/**
 * @author: codeJerry
 * @description: 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 感谢 Marcos 贡献此图。  来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/trapping-rain-water 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 放弃挣扎
 * @date: 2020/04/04 21:03
 */
public class Trap_42 {
    public int trap(int[] height) {
        if (height.length == 0 || height.length == 1) {return 0;}
        int area = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int leftPosition = 0;
        while (leftPosition < height.length && height[leftPosition] == 0){leftPosition++;}
        if (leftPosition == height.length){return 0;}
        //寻找到第一个有高度的起点
        int initHeight = height[leftPosition];
        stack.push(height[leftPosition]);

        int rightPosition = leftPosition + 1;

        while (rightPosition < height.length){
            while (height[rightPosition] < initHeight){
                stack.push(height[rightPosition]);
                rightPosition++;
                if (rightPosition == height.length){
                    int endHeight = 0;
                    int currentHeight;
                    while (!stack.empty()){
                        currentHeight = stack.pop();
                    }

                    return area;
                }
            }
            //
            System.out.println("rightPosition"+ rightPosition);

            while (!stack.empty()){
                area += initHeight - stack.pop();
            }
            initHeight = height[rightPosition];
            System.out.println("initHeight"+initHeight);
            stack.push(initHeight);
            rightPosition++;
        }


        return area;
    }

    public static void main(String[] args) {
        Trap_42 trap_42 = new Trap_42();
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
//        int [] height = {0,0,0,0,0,0};
        System.out.println(trap_42.trap(height));
    }
}
