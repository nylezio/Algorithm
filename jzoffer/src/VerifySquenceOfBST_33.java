//二叉搜索树的后序遍历序列
public class VerifySquenceOfBST_33 {
    public static boolean VerifySquenceOfBST(int [] sequence) {
        int len = sequence.length;
        if (len == 0){
            return false;
        }
        return Verify(sequence, 0 , len - 1);
    }
    public static boolean Verify(int [] sequence, int start, int end) {
        if (start >= end){
            return true;
        }
        int i = start;
        while(sequence[i] < sequence[end] && i < end) i++;
        for(int j = end; j > i; j--){
            if(sequence[j] < sequence[end])
                return false;
        }
        return Verify(sequence, start, i - 1) && Verify(sequence, i, end - 1);
    }

    public static void main(String[] args) {
        int[] sequence = {2,1,3,5,7,8,6,4};
        Boolean bool = VerifySquenceOfBST(sequence);
        System.out.println(bool);
    }
}
